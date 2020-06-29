package bookstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
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
		usuario.setEmail("teste2@teste2.com");
		usuario.setNomeCompleto("Nayara Balarotti");
		usuario.setSenha("hello2");		

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
	
	@Test
	public void testGetUsuariosEncontrados() {
		Integer usuarioId = 1;
		Usuario usuario = usuarioDao.get(usuarioId);
		
		if (usuario != null) {
			System.out.println(usuario.getEmail());
		}
		
		assertNotNull(usuario);
		
	}
	
	@Test
	public void testGetUsuariosNaoEncontrados() {
		Integer usuarioId = 5;
		Usuario usuario = usuarioDao.get(usuarioId);
				
		assertNull(usuario);
	}
	
	@Test
	public void testDeletarUsuarios() {
		Integer usuarioId = 4;
		usuarioDao.deletar(usuarioId);
		
		Usuario usuario = usuarioDao.get(usuarioId);
		
		assertNull(usuario);
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testDeletarUsuariosInexistentes() {
		Integer usuarioId = 4;
		usuarioDao.deletar(usuarioId);
	}
	
	@AfterClass
	public static void destruirClasse() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
