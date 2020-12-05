package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "PRODUTO")
public class Produto {
	
	@Id
	@Column(name ="ID_PRODUTO")
	@GeneratedValue(generator = "SEG_ID_PRODUTO")
	@SequenceGenerator(name = "SEG_ID_PRODUTO", sequenceName = "SEG_ID_PRODUTO", allocationSize = 1)
	private Integer id;
	@Column(name ="DESCRICAO")
	private String descricao;
	@Column(name ="PRECO")
	private Double preco;
	@Column(name ="QTD_ITENS")
	private Integer qtd_itens;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQtd_itens() {
		return qtd_itens;
	}
	public void setQtd_itens(Integer qtd_itens) {
		this.qtd_itens = qtd_itens;
	}
	
	
}
