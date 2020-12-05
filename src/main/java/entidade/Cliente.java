package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "CLIENTE")
public class Cliente {
	
	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(generator = "SEG_ID_CLIENTE")
	@SequenceGenerator(name = "SEG_ID_CLIENTE", sequenceName = "SEG_ID_CLIENTE", allocationSize = 1)
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "NOMEFANTASIA")
	private String nomeFantasia;
	@Column(name = "CPF")
	private String cpf;
	@Column(name = "CNPJ")
	private String cnpj;
	@Column(name = "TELEFONE")
	private String telefone;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "RUA")
	private String rua;
	@Column(name = "NUMERO")
	private String numero;
	@Column(name = "BAIRRO")
	private String bairro;
	@Column(name = "CIDADE")
	private String cidade;
	@Column(name = "CEP")
	private String cep;
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	
	
}
