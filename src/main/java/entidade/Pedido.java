package entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

	@Id
	@Column(name = "ID_PEDIDO")
	@GeneratedValue(generator = "SEQ_ID_PEDIDO")
	@SequenceGenerator(name = "SEQ_ID_PEDIDO", sequenceName = "SEQ_ID_PEDIDO", allocationSize = 1)
	private int id;

	@Column(name = "RUA")
	private String rua;
	@Column(name = "NUMERO")
	private Integer numero;
	@Column(name = "BAIRRO")
	private String bairro;
	@Column(name = "CIDADE")
	private String cidade;
	@Column(name = "CEP")
	private String cep;
	@Column(name = "COMPLEMENTO")
	private String complemento;
	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	@Column(name = "DATA_PEDIDO")
	private Date dataPedido;
	@Column(name = "DATA_ENTREGA")
	private Date dataEntrega;
	@Column(name = "FORMA_PAGAMENTO")
	private String formaPagamento;
	@Column(name = "OBS")
	private String obs;
	@Column(name = "SN_RETIRAR_LOJA")
	private String snRetirarEmLoja;

	@OneToOne
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", nullable = false)
	private Cliente cliente;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<PedidoProduto> listaPedidoProduto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getSnRetirarEmLoja() {
		return snRetirarEmLoja;
	}

	public void setSnRetirarEmLoja(String snRetirarEmLoja) {
		this.snRetirarEmLoja = snRetirarEmLoja;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<PedidoProduto> getListaPedidoProduto() {
		return listaPedidoProduto;
	}

	public void setListaPedidoProduto(List<PedidoProduto> listaPedidoProduto) {
		this.listaPedidoProduto = listaPedidoProduto;
	}

}
