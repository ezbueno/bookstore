package bookstore.entidade;
// Generated 14 de jun. de 2020 23:22:11 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "bookstoredb")
public class Usuario implements java.io.Serializable {

	private Integer usuarioId;
	private String email;
	private String nomeCompleto;
	private String senha;

	public Usuario() {
	}

	public Usuario(String email, String nomeCompleto, String senha) {
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "usuario_id", unique = true, nullable = false)
	public Integer getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "nome_completo", nullable = false)
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	@Column(name = "senha", nullable = false)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
