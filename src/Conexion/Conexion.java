package Conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
	private static EntityManager em=null;
	
	
	public Conexion() {
		
		em=this.getEm();
	}
	
	public static EntityManager getEm() {
		
		if(em==null) {
			
			EntityManagerFactory emf =
					Persistence.createEntityManagerFactory("previo2");
					em = emf.createEntityManager();
		}
		
		return em;
		
		
	}
	
}
