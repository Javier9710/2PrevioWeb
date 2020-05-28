package Test;

import Dao.ClienteDao;
import Dao.TiendaDao;
import Dto.Cliente;
import Dto.Tienda;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteDao cD = new ClienteDao();
		Cliente C = new Cliente();
		//c.setId(1090);
		C.setNombre("javier");
		C.setClave("1234");
		C.setEmail("@gmail.com");
		cD.registrar(C);
		
		
		TiendaDao tD = new TiendaDao();
		Tienda t = new Tienda();
		//t.setId(id);
		t.setNombre("tiendas1");
		t.setClave("1234");
		t.setDescripcion("descripcion");
		t.setEmail("@email.com");
		t.setFacebook("facebook");
		t.setImagen("imagen");
		t.setLema("este es el lema");
		t.setPropietario("andres");
		t.setWeb("wwww.web.com");
		tD.registrar(t);
		
		
		

	}

}
