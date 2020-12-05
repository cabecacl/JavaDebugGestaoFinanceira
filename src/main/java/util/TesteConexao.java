package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Usuario;

public class TesteConexao {

	public static void main(String[] args) {
		
		EntityManager ent = JpaUtil.getEntityManager();
		
		System.out.println(ent.isOpen());
		
		Usuario usuario = new Usuario();
		usuario.setCpf("12345");
		usuario.setNome("O menino chapado");
		usuario.setSenha("112233");
		
		EntityTransaction tr = ent.getTransaction();
		tr.begin();
		ent.persist(usuario);
		
		tr.commit();
		ent.close();
		System.out.println("-- inseriru --");

	}

}
