package controle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.PedidoDAO;
import dao.PedidoDAOImpl;
import entidade.Cliente;
import entidade.Pedido;
import entidade.PedidoProduto;
import entidade.Produto;

@ManagedBean(name = "PedidoBean")
@SessionScoped
public class PedidoBean {

	private Pedido pedido;

	private List<Produto> listaProdutos;
	private List<Pedido> listaPedidos;
	private List<Cliente> listaClientes;

	private Date dataInicio, dataFim;
	private boolean retirarEmLoja;
	
	private Long idPedido; //Variavel utilizada para remover e editar pedido
	
	private PedidoDAO pedidoDAO;
	
	public PedidoBean() {
		
		this.pedidoDAO = new PedidoDAOImpl();

		this.iniciarCampos();
		
	}

	public void salvarPedido() {
		System.out.println(" -- chegei aqui --");
		
		this.pedidoDAO.inserirPedido(pedido);
		
		
//		if(this.pedido.getId() != null) {
//			this.pedidoDAO.alterarPedido(this.pedido);
//			this.iniciarCampos();
//			
//			try {
//				this.context = FacesContext.getCurrentInstance();
//				context.getExternalContext().redirect("pesquisarPedido.xhtml");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}else {
//			this.pedidoDAO.inserirPedido(this.pedido);
//			this.iniciarCampos();
//		}
	}

	/**
	 * Metodo utilizado para inicializar os campos após ações
	 * de salvar e editar
	 */
	public void iniciarCampos() {
		
		this.pedido = new Pedido();
		this.pedido.setDataPedido(new Date());
		this.pedido.setCliente(new Cliente());
		this.pedido.setListaPedidoProduto(new ArrayList<PedidoProduto>());

		this.listaProdutos = this.pedidoDAO.listarTodosProdutos();
		this.listaClientes = this.pedidoDAO.listarTodosClientes(); 
		this.listaPedidos = new ArrayList<Pedido>();
		
		this.retirarEmLoja = false;
	}
	
	public void cancelarPedido() {
		
	}

	public void adicionarPeca() {

			
	}

	public String removerPeca() {
		
		return "";
	}
	
	public void pesquisarPedidos() {
		this.listaPedidos = this.pedidoDAO.pesquisarPedidos(pedido, dataInicio, dataFim);
//		this.listaPedidos = this.pedidoDAO.listarTodosPedidos();
		System.out.println("-- pesquisou --");
	}
	
	public void removerPedido() {
		
//		Pedido pedidoRemover = new Pedido();
//		pedidoRemover.setId(this.idPedido);
//		this.pedidoDAO.excluirPedido(pedidoRemover);
//		
		this.pesquisarPedidos();
	}
	
	public String editarPedido() {
		
		this.pedido = this.pedidoDAO.pesquisarPedido(this.idPedido);
				
		return "/paginas/pedido/cadastroPedido.xhtml?faces-redirect=true&amp;includeViewParams=true";
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public boolean isRetirarEmLoja() {
		return retirarEmLoja;
	}

	public void setRetirarEmLoja(boolean retirarEmLoja) {
		this.retirarEmLoja = retirarEmLoja;
	}
	
	
}
