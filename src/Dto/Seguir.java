package Dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "seguir")
public class Seguir implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 570696750959752333L;
	@Id
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	@Id
	@ManyToOne
	@JoinColumn(name="tienda")
	private Tienda tienda;

	public Seguir() {
		// TODO Auto-generated constructor stub
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
	

}
