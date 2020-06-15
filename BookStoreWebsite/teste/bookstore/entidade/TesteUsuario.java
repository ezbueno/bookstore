package bookstore.entidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("teste2@teste2.com");
		usuario.setNomeCompleto("Nayara Balarotti");
		usuario.setSenha("hello2");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
													
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		entityManagerFactory.close();
		
		System.out.println("Teste realizado com sucesso!");
	}

}
