package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conexion;
import Dto.Estudiante;

public class EstudianteDao {
	
	EntityManager em=null;

	public EstudianteDao() {
		em = Conexion.getEm();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Estudiante> listar(){
		return (List<Estudiante>) em.createQuery("select x from Estudiante x").getResultList();	
		
	}
	
	
	public void registrar (Estudiante estudiante) {
		 try {
			 em.getTransaction().begin();
			 em.persist(estudiante);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
	
	 public void actualizar (Estudiante estudiante) {
		 try {
			 em.getTransaction().begin();
			 em.merge(estudiante);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Estudiante u = em.find(Estudiante.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 }
		
		 
		 
	 }
	 
	 public Estudiante buscar (Integer m) {
		 Estudiante x = null;
		 try {
			 em.getTransaction().begin();
			 Estudiante u = em.find(Estudiante.class, m);
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
