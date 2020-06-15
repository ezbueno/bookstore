package bookstore.dao;

import java.util.List;

public interface GenericoDao<T> {

	public T criar(T t);
	
	public T atualizar(T t);
	
	public T get(Object id);
	
	public void deletar(Object id);
	
	public List<T> listarTudo();
	
	public Long contar();
}
