package bookstoredb.entidade2;
// Generated 11 de jun. de 2020 18:24:09 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetalheId generated by hbm2java
 */
@Embeddable
public class DetalheId implements java.io.Serializable {

	private Integer pedidoId;
	private Integer livroId;
	private int quantidade;
	private float subtotal;

	public DetalheId() {
	}

	public DetalheId(int quantidade, float subtotal) {
		this.quantidade = quantidade;
		this.subtotal = subtotal;
	}

	public DetalheId(Integer pedidoId, Integer livroId, int quantidade, float subtotal) {
		this.pedidoId = pedidoId;
		this.livroId = livroId;
		this.quantidade = quantidade;
		this.subtotal = subtotal;
	}

	@Column(name = "pedido_id")
	public Integer getPedidoId() {
		return this.pedidoId;
	}

	public void setPedidoId(Integer pedidoId) {
		this.pedidoId = pedidoId;
	}

	@Column(name = "livro_id")
	public Integer getLivroId() {
		return this.livroId;
	}

	public void setLivroId(Integer livroId) {
		this.livroId = livroId;
	}

	@Column(name = "quantidade", nullable = false)
	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "subtotal", nullable = false, precision = 12, scale = 0)
	public float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetalheId))
			return false;
		DetalheId castOther = (DetalheId) other;

		return ((this.getPedidoId() == castOther.getPedidoId()) || (this.getPedidoId() != null
				&& castOther.getPedidoId() != null && this.getPedidoId().equals(castOther.getPedidoId())))
				&& ((this.getLivroId() == castOther.getLivroId()) || (this.getLivroId() != null
						&& castOther.getLivroId() != null && this.getLivroId().equals(castOther.getLivroId())))
				&& (this.getQuantidade() == castOther.getQuantidade())
				&& (this.getSubtotal() == castOther.getSubtotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPedidoId() == null ? 0 : this.getPedidoId().hashCode());
		result = 37 * result + (getLivroId() == null ? 0 : this.getLivroId().hashCode());
		result = 37 * result + this.getQuantidade();
		result = 37 * result + (int) this.getSubtotal();
		return result;
	}

}
