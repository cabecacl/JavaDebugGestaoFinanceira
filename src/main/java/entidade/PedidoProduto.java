package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOPRODUTO")
public class PedidoProduto {

	@Id
	@Column(name = "ID_PEDIDO_PRODUTO")
	@GeneratedValue(generator = "SEQ_ID_PEDIDO_PRODUTO")
	@SequenceGenerator(name = "SEQ_ID_PEDIDO_PRODUTO", sequenceName = "SEQ_ID_PEDIDO_PRODUTO", allocationSize = 1)
	private Integer id;
	
	@Column(name = "QTD")
	private Integer qtd;
	
	@Column(name = "VALORUNITARIO")
	private Double valorUnitario;

	@ManyToOne
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID_PEDIDO", nullable = false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", nullable = false)
	private Produto produto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
