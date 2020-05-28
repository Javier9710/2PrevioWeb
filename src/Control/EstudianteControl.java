package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EstudianteDao;
import Dto.Ciudad;
import Dto.Estudiante;

/**
 * Servlet implementation class EstudianteControl
 */
@WebServlet("/EstudianteControl")
public class EstudianteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstudianteControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accion= request.getParameter("accion");
		
		switch (accion) {
		case "registro":
			int id = Integer.parseInt(request.getParameter("usuario"));
			String nombre = request.getParameter("nombre");
			int ciudad = Integer.parseInt(request.getParameter("ciudad"));
			EstudianteDao eD = new EstudianteDao();
			if (eD.buscar(id)==null) {
				Estudiante e = new Estudiante();
				e.setInEstudiante(id);
				e.setNombre(nombre);
				Ciudad c = new Ciudad();
				c.setId(ciudad);
				e.setCiudad(c);
				eD.registrar(e);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				
				
			}else {
				System.out.println("el usuario ya existe");
				request.getRequestDispatcher("/registro.jsp").forward(request, response);
			}
			
			break;
			
		case "eliminar":
			int id1 = Integer.parseInt(request.getParameter("id"));
			EstudianteDao eD1 = new EstudianteDao();
			
			if (eD1.buscar(id1)!=null) {
				eD1.eliminar(id1);
				request.getRequestDispatcher("/inicio.jsp").forward(request, response);
			}else {
				System.out.println("Error");
			}
			break;
			
		case "editar":
			
			int editar = Integer.parseInt(request.getParameter("id"));
			System.out.println("entra:"+editar);
			EstudianteDao eD2 = new EstudianteDao();
			Estudiante e = new Estudiante();
			e = eD2.buscar(editar);
			request.setAttribute("estudiante", e);
			System.out.println(e.getNombre());
			System.out.println(e.getCiudad().getNombre());
			System.out.println(e.getInEstudiante());
			request.getRequestDispatcher("editar.jsp").forward(request, response);
			break;
			
		case "update":
			
			int ced = Integer.parseInt(request.getParameter("usuario"));
			String nombre1 = request.getParameter("nombre");
			int ciu = Integer.parseInt(request.getParameter("ciudad"));
			Ciudad c1 = new Ciudad();
			c1.setId(ciu);
			Estudiante e2 = new Estudiante();
			e2.setInEstudiante(ced);
			e2.setNombre(nombre1);
			e2.setCiudad(c1);
			EstudianteDao eD3 = new EstudianteDao();
			eD3.actualizar(e2);
			request.getRequestDispatcher("inicio.jsp").forward(request, response);
			break;

		default:
			break;
		}
	}

}
