package bookstoredb.entidade2;
// Generated 11 de jun. de 2020 18:24:09 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name = "categoria", catalog = "bookstoredb")
public class Categoria implements java.io.Serializable {

	private Integer categoriaId;
	private String nome;
	private Set livros = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(String nome, Set livros) {
		this.nome = nome;
		this.livros = livros;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "categoria_id", unique = true, nullable = false)
	public Integer getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	@Column(name = "nome", nullable = false, length = 30)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	public Set getLivros() {
		return this.livros;
	}

	public void setLivros(Set livros) {
		this.livros = livros;
	}

}
