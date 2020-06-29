package bookstore.entidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("teste4@teste4.com");
		usuario.setNomeCompleto("Camila Roma");
		usuario.setSenha("hello4");
		
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
