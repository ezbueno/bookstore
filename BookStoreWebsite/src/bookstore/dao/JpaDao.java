package bookstore.dao;

import javax.persistence.EntityManager;

public class JpaDao<E> {

	protected EntityManager entityManager;

	public JpaDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public E criar(E entidade) {
		entityManager.getTransaction().begin();
		entityManager.persist(entidade);
		entityManager.flush();
		entityManager.refresh(entidade);
		entityManager.getTransaction().commit();
		
		return entidade;
	}
	
	public E atualizar(E entidade) {
		entityManager.getTransaction().begin();
		entidade = entityManager.merge(entidade);
		entityManager.getTransaction().commit();
		return entidade;
	}
}
