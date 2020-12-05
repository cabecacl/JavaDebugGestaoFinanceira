package dao;

import entidade.Usuario;

public interface UsuarioDAO {

	public void salvar(Usuario usuario);
	public void alterar(Usuario usuario);
	public void remover(Usuario usuario);
	public Usuario pesquisar(int id);
	

}
