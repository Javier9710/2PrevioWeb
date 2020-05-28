package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.EstudianteDao;
import Dto.Estudiante;

/**
 * Servlet implementation class AccesoControl
 */
@WebServlet("/AccesoControl")
public class AccesoControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccesoControl() {
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
		HttpSession sesion = request.getSession();
		String accion = request.getParameter("accion");
		switch (accion) {
		case "ingreso":
			
			int usuario = Integer.parseInt(request.getParameter("usuario"));
			System.out.println("usu: " + usuario);
			String nombre = request.getParameter("pass");
			System.out.println("nom: " + nombre);
			EstudianteDao eD = new EstudianteDao();
			Estudiante e = new Estudiante();
			e=eD.buscar(usuario);
			if (e!=null && e.getNombre().equalsIgnoreCase(nombre) ) {
				sesion.setAttribute("usuario", usuario);
				request.getRequestDispatcher("/inicio.jsp").forward(request, response);
				
			}else {
				
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				
				
			}
			
			
			break;

		default:
			break;
		}
	}

}
