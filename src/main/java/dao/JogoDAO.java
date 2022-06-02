package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import variaveis.Jogovar;
import util.JPAUtil;

public class JogoDAO {

	public static void salvar(Jogovar j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(j);
		em.getTransaction().commit();
		em.close();
		
	}
	public static void editar(Jogovar j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(j);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public static void deletar(Jogovar j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		j = em.find(Jogovar.class, j.getId() );
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Jogovar> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		Query j = em.createQuery("select j from Jogovar j");
		List<Jogovar> lista = j.getResultList();
		em.close();
		return lista;
	}
	
	
	
	
}
