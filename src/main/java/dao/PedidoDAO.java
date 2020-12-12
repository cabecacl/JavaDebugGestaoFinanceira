package dao;

import java.util.Date;
import java.util.List;

import entidade.Cliente;
import entidade.Pedido;
import entidade.Produto;

public interface PedidoDAO {
	
	public void inserirPedido(Pedido pedido);
	public void alterarPedido(Pedido pedido);
	public void excluirPedido(Pedido pedido);
	public Pedido pesquisarPedido(Long idPedido);
	public List<Pedido> listarTodosPedidos();
	public List<Produto> listarTodosProdutos();
	public List<Cliente> listarTodosClientes();
	
	public void inserirProduto(Produto produto);
	public void excluirProduto(Produto produto);
		
	public List<Pedido> pesquisarPedidos(Pedido pedido, Date dataInicio, Date dataFim);

}
