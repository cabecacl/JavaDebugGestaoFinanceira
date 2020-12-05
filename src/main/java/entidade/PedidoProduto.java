package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "PEDIDOPRODUTO")
public class PedidoProduto {

	@Id
	@Column(name = "ID_PEDIDO_PRODUTO")
	@GeneratedValue(generator = "SEG_ID_PEDIDO_PRODUTO")
	@SequenceGenerator(name = "SEG_ID_PEDIDO_PRODUTO", sequenceName = "SEG_ID_PEDIDO_PRODUTO", allocationSize = 1)
	private Integer id;
	
	@Column(name = "ID_PEDIDO")
	private Integer id_pedido;
	@Column(name = "ID_PRODUTO")
	private Integer id_produto;
	@Column(name = "QTD")
	private Integer qtd;
	@Column(name = "VALORUNITARIO")
	private Double valorUnitario;
	
	
	public Integer getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
