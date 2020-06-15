package bookstore.entidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCategoria {

	public static void main(String[] args) {
		
		Categoria categoria = new Categoria("Advanced Java");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
													
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		entityManagerFactory.close();
		
		System.out.println("Teste realizado com sucesso!");
	}

}
