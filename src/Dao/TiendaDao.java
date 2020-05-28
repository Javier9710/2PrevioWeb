package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;
import Dto.Cliente;
import Dto.Tienda;


public class TiendaDao {
	
	EntityManager em=null;

	public TiendaDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Tienda> listar(){
		return (List<Tienda>) em.createQuery("select x from Estudiante x").getResultList();	
		
	}
	
	
	public void registrar (Tienda tienda) {
		 try {
			 em.getTransaction().begin();
			 em.persist(tienda);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
	 public void actualizar (Tienda tienda) {
		 try {
			 em.getTransaction().begin();
			 em.merge(tienda);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
	
}