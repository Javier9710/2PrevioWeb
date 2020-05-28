package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;
import Dto.Cliente;


public class ClienteDao {
	
	EntityManager em=null;

	public ClienteDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Cliente> listar(){
		return (List<Cliente>) em.createQuery("select x from Estudiante x").getResultList();	
		
	}
	
	
	public void registrar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.persist(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
	
	 public void actualizar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.merge(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Cliente u = em.find(Cliente.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 }
		
		 
		 
	 }
	 
	 public Cliente buscar (Integer m) {
		 Cliente x = null;
		 try {
			 em.getTransaction().begin();
			 Cliente u = em.find(Cliente.class, m);
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