package entidade;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "PEDIDO")
public class Pedido {
	
	@Id
	@Column(name = "ID_PEDIDO")
	@GeneratedValue(generator = "SEG_ID_PEDIDO")
	@SequenceGenerator(name = "SEG_ID_PEDIDO", sequenceName = "SEG_ID_PEDIDO", allocationSize = 1)
	private Integer id;
	@Column(name = "ID_CLIENTE")	
	private Integer id_Cliente;
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
	@Column(name = "VALORTOTAL")
	private Double valorTotal;
	@Column(name = "DATAPEDIDO")
	private String dataPedido;
	@Column(name = "DATAENTREGA")
	private String dataEntrega;
	@Column(name = "HORAENTREGA")
	private String horaEntrega;
	@Column(name = "FORMAPAGAMENTO")
	private String formaPagamento;
	@Column(name = "OBS")
	private String obs;
	@Column(name = "SNRETIRAREMLOJA")
	private String snRetirarEmLoja;
	private ArrayList<PedidoProduto> listaPedidoProduto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
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
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getHoraEntrega() {
		return horaEntrega;
	}
	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
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
	public ArrayList<PedidoProduto> getListaPedidoProduto() {
		return listaPedidoProduto;
	}
	public void setListaPedidoProduto(ArrayList<PedidoProduto> listaPedidoProduto) {
		this.listaPedidoProduto = listaPedidoProduto;
	}


}
