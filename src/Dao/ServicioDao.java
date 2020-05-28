package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;
import Dto.Servicio;


public class ServicioDao {
	
	EntityManager em=null;

	public ServicioDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Servicio> listar(){
		return (List<Servicio>) em.createQuery("select x from Servicio x").getResultList();	
		
	}
	
	
	public void registrar (Servicio servicio) {
		 try {
			 em.getTransaction().begin();
			 em.persist(servicio);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
}