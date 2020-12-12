package dao;

import entidade.PedidoProduto;

public interface PedidoProdutoDAO {
	
	public void salvar(PedidoProduto pedidoProduto);
	public void alterar(PedidoProduto pedidoProduto);
	public void remover(PedidoProduto pedidoProduto);
	public PedidoProduto pesquisar(int id);

}
