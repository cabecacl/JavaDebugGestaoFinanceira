package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.jpa.criteria.predicate.IsEmptyPredicate;

import entidade.Cliente;
import entidade.Pedido;
import entidade.Produto;
import util.JpaUtil;

public class PedidoDAOImpl implements PedidoDAO {

	@Override
	public void inserirPedido(Pedido pedido) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();

		ent.persist(pedido);

		trans.commit();
		ent.close();
	}

	@Override
	public void alterarPedido(Pedido pedido) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();

		ent.merge(pedido);

		trans.commit();
		ent.close();

	}

	@Override
	public void excluirPedido(Pedido pedido) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();
		
		Pedido pedidoRemover = ent.find(Pedido.class, pedido.getId());
		ent.remove(pedidoRemover);

		trans.commit();
		ent.close();
	}

	@Override
	public Pedido pesquisarPedido(Long idPedido) {
		EntityManager ent = JpaUtil.getEntityManager();

		Pedido pedido = ent.find(Pedido.class, idPedido);

		return pedido;
	}

	@Override
	public List<Pedido> listarTodosPedidos() {
		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery("from Pedido p");

		List<Pedido> pedidos = query.getResultList();

		return pedidos;
	}

	@Override
	public List<Produto> listarTodosProdutos() {
		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery("from Produto p");

		List<Produto> produtos = query.getResultList();

		return produtos;
	}
	
	@Override
	public List<Cliente> listarTodosClientes() {
		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery("from Cliente c");

		List<Cliente> clientes = query.getResultList();

		return clientes;
	}
	
	@Override
	public void inserirProduto(Produto produto) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();

		ent.persist(produto);

		trans.commit();
		ent.close();

	}

	@Override
	public void excluirProduto(Produto produto) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();
		
		Produto produtoRemover = ent.find(Produto.class, produto.getId());
		ent.remove(produtoRemover);

		trans.commit();
		ent.close();

	}

	
	@Override
	public List<Pedido> pesquisarPedidos(Pedido pedido, Date dataInicio, Date dataFim) {

		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery(" FROM Pedido p where 1=1 " + 
													this.montarWherePedido(pedido, dataInicio, dataFim));

		List<Pedido> pedidos = query.getResultList();

		return pedidos;

	}
	
	private String montarWherePedido(Pedido pedido, Date dataInicio, Date dataFim) {
		
		String where = "";
		SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");
		
		if(pedido.getId() > 0) {
			where += " and p.id = " + pedido.getId();
		}else {
			if(dataInicio != null && dataFim != null) {
				where += " and p.dataPedido BETWEEN TO_DATE('" + dataSimples.format(dataInicio) + "', 'DD/MM/YYYY') and "
						+ " TO_DATE('" + dataSimples.format(dataFim) + "', 'DD/MM/YYYY')";
			}
			
			if(pedido.getCliente() != null && 
   			   pedido.getCliente().getNome() != null && 
   			   !pedido.getCliente().getNome().isEmpty()) {
				where += " and upper(p.cliente.nome) like upper('%" + pedido.getCliente().getNome() + "%')";
				
			}
		}
		
		return where;
		
	}

}
