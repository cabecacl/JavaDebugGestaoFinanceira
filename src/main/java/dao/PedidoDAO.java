package dao;

import entidade.Pedido;

public interface PedidoDAO {
	
	public void salvar(Pedido pedido);
	public void alterar(Pedido pedido);
	public void remover(Pedido pedido);
	public Pedido pesquisar(int id);
	

}
