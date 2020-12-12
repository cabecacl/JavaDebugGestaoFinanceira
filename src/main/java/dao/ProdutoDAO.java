package dao;

import entidade.Produto;

public interface ProdutoDAO {
	
	public void salvar(Produto produto);
	public void alterar(Produto produto);
	public void remover(Produto produto);
	public Produto pesquisar(int id);

}
