package bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import bookstore.entidade.Usuario;

public class UsuarioDao extends JpaDao<Usuario> implements GenericoDao<Usuario> {
	
	public UsuarioDao(EntityManager entityManager) {
		super(entityManager);
	}
	
	public Usuario criar(Usuario usuario) {
		return super.criar(usuario);
	}

	@Override
	public Usuario atualizar(Usuario usuario) {
		return super.atualizar(usuario);
	}

	@Override
	public Usuario get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarTudo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long contar() {
		// TODO Auto-generated method stub
		return null;
	}

}
