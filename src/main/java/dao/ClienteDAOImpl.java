package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import util.JpaUtil;

public class ClienteDAOImpl implements ClienteDAO {
	
	@Override
	public boolean inserirCliente(Cliente cliente) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();

		tx.begin();

		ent.merge(cliente);

		tx.commit();
		ent.close();

		return true;
	}
	
	@Override
	public boolean alterarCliente(Cliente cliente) {
		EntityManager ent = JpaUtil.getEntityManager();		
		EntityTransaction tx = ent.getTransaction();
		
		tx.begin();
		
		Cliente existe = ent.find(Cliente.class, cliente.getCpf());
		
		if(existe != null) {
			
			existe.setNome(cliente.getNome());
			existe.setNomeFantasia(cliente.getNomeFantasia());
			existe.setCpf(cliente.getCpf());
			existe.setCnpj(cliente.getCnpj());
			existe.setTelefone(cliente.getTelefone());
			existe.setEmail(cliente.getEmail());
			existe.setRua(cliente.getRua());
			existe.setNumero(cliente.getNumero());
			existe.setBairro(cliente.getBairro());
			existe.setCidade(cliente.getCidade());
			existe.setCep(cliente.getCep());
			existe.setComplemento(cliente.getComplemento());

			ent.merge(cliente);
			tx.commit();
			ent.close();
			return true;
		}else {
			return false;
		}

	}
	
	@Override
	public boolean removerCliente(Cliente cliente) {
		
		
		
		return false;
		
	}


}