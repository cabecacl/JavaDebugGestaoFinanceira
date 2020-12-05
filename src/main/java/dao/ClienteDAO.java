package dao;

import entidade.Cliente;

public interface ClienteDAO {
	
	public boolean inserirCliente(Cliente cliente);
	public boolean alterarCliente(Cliente cliente);
	public boolean removerCliente(Cliente cliente);
	public Cliente pesquisarCliente(int id);
	
}
