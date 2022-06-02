package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpauti");
	
	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
}