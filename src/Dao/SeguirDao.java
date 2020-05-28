package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;

import Dto.Seguir;


public class SeguirDao {
	
	EntityManager em=null;

	public SeguirDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Seguir> listar(){
		return (List<Seguir>) em.createQuery("select x from Estudiante x").getResultList();	
		
	}
	
	
	public void registrar (Seguir seguir) {
		 try {
			 em.getTransaction().begin();
			 em.persist(seguir);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
}