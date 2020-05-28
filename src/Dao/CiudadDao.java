package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;
import Dto.Ciudad;

public class CiudadDao {
	
	EntityManager em=null;

	public CiudadDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Ciudad> listar(){
		return (List<Ciudad>) em.createQuery("select x from Ciudad x").getResultList();	
		
	}
	
	
	public void registrar (Ciudad ciudad) {
		 try {
			 em.getTransaction().begin();
			 em.persist(ciudad);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
	
	 public void actualizar(Ciudad ciudad) {
		 try {
			 em.getTransaction().begin();
			 em.merge(ciudad);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Ciudad u = em.find(Ciudad.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 }
		
		 
		 
	 }
	 
	 public Ciudad buscar (Integer m) {
		 Ciudad x = null;
		 try {
			 em.getTransaction().begin();
			 Ciudad u = em.find(Ciudad.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());
			 x=u;
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {

			 }
		return x;
		
		 
		 
	 }

}
