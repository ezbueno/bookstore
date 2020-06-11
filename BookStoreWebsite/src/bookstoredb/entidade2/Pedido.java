package bookstoredb.entidade2;
// Generated 11 de jun. de 2020 18:24:09 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name = "pedido", catalog = "bookstoredb")
public class Pedido implements java.io.Serializable {

	private Integer pedidoId;
	private Cliente cliente;
	private Date dataPedido;
	private String enderecoEntrega;
	private String nomeDestinatario;
	private String telefoneDestinatario;
	private String metodoPagamento;
	private float total;
	private String status;
	private Set detalhes = new HashSet(0);

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date dataPedido, String enderecoEntrega, String nomeDestinatario,
			String telefoneDestinatario, String metodoPagamento, float total, String status) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.enderecoEntrega = enderecoEntrega;
		this.nomeDestinatario = nomeDestinatario;
		this.telefoneDestinatario = telefoneDestinatario;
		this.metodoPagamento = metodoPagamento;
		this.total = total;
		this.status = status;
	}

	public Pedido(Cliente cliente, Date dataPedido, String enderecoEntrega, String nomeDestinatario,
			String telefoneDestinatario, String metodoPagamento, float total, String status, Set detalhes) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.enderecoEntrega = enderecoEntrega;
		this.nomeDestinatario = nomeDestinatario;
		this.telefoneDestinatario = telefoneDestinatario;
		this.metodoPagamento = metodoPagamento;
		this.total = total;
		this.status = status;
		this.detalhes = detalhes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pedido_id", unique = true, nullable = false)
	public Integer getPedidoId() {
		return this.pedidoId;
	}

	public void setPedidoId(Integer pedidoId) {
		this.pedidoId = pedidoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_pedido", nullable = false, length = 19)
	public Date getDataPedido() {
		return this.dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Column(name = "endereco_entrega", nullable = false, length = 256)
	public String getEnderecoEntrega() {
		return this.enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	@Column(name = "nome_destinatario", nullable = false, length = 30)
	public String getNomeDestinatario() {
		return this.nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	@Column(name = "telefone_destinatario", nullable = false, length = 15)
	public String getTelefoneDestinatario() {
		return this.telefoneDestinatario;
	}

	public void setTelefoneDestinatario(String telefoneDestinatario) {
		this.telefoneDestinatario = telefoneDestinatario;
	}

	@Column(name = "metodo_pagamento", nullable = false, length = 20)
	public String getMetodoPagamento() {
		return this.metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	@Column(name = "total", nullable = false, precision = 12, scale = 0)
	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Column(name = "status", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	public Set getDetalhes() {
		return this.detalhes;
	}

	public void setDetalhes(Set detalhes) {
		this.detalhes = detalhes;
	}

}
