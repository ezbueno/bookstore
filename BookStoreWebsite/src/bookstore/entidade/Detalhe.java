package bookstore.entidade;
// Generated 14 de jun. de 2020 18:01:59 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Detalhe generated by hbm2java
 */
@Entity
@Table(name = "detalhe", catalog = "bookstoredb")
public class Detalhe implements java.io.Serializable {

	private DetalheId id;
	private Livro livro;
	private Pedido pedido;

	public Detalhe() {
	}

	public Detalhe(DetalheId id) {
		this.id = id;
	}

	public Detalhe(DetalheId id, Livro livro, Pedido pedido) {
		this.id = id;
		this.livro = livro;
		this.pedido = pedido;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "pedidoId", column = @Column(name = "pedido_id")),
			@AttributeOverride(name = "livroId", column = @Column(name = "livro_id")),
			@AttributeOverride(name = "quantidade", column = @Column(name = "quantidade", nullable = false)),
			@AttributeOverride(name = "subtotal", column = @Column(name = "subtotal", nullable = false, precision = 12, scale = 0)) })
	public DetalheId getId() {
		return this.id;
	}

	public void setId(DetalheId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "livro_id", insertable = false, updatable = false)
	public Livro getLivro() {
		return this.livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido_id", insertable = false, updatable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
