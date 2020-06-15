package bookstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import bookstore.entidade.Usuario;

public class UsuarioDaoTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UsuarioDao usuarioDao;
	
	@BeforeClass
	public static void setupClasse() {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");								
		entityManager = entityManagerFactory.createEntityManager();
		
		usuarioDao = new UsuarioDao(entityManager);
	}
	
	@Test
	public void testCriarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setEmail("teste1@teste1.com");
		usuario.setNomeCompleto("Ezandro Bueno");
		usuario.setSenha("hello1");		

		usuario = usuarioDao.criar(usuario);
			
		assertTrue(usuario.getUsuarioId() > 0);
	}
	
	@Test(expected = PersistenceException.class)
	public void testCriarUsuarioSemCampoSet() {
		Usuario usuario = new Usuario();
		usuario = usuarioDao.criar(usuario);
	}
	
	@Test
	public void testAtualizarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setUsuarioId(1);
		usuario.setEmail("teste1@teste1.com");
		usuario.setNomeCompleto("Bueno Ezandro");
		usuario.setSenha("novohello");
		
		String esperado = "novohello";
		String atual = usuario.getSenha();
		
		usuario = usuarioDao.atualizar(usuario);
		
		assertEquals(esperado, atual);
	}
	
	@AfterClass
	public static void destruirClasse() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
