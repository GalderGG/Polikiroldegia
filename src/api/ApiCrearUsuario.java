package api;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import modelo.bean.Usuario;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiCrearUsuario
 */
@WebServlet("/ApiCrearUsuario")
public class ApiCrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApiCrearUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String jsonUsuario = request.getParameter("usuario");
		ModeloUsuario modeloUsuario = new ModeloUsuario();

		JSONObject jsonObject = new JSONObject(jsonUsuario);

		Usuario usuario = new Usuario();
		usuario.setNombreApellido(jsonObject.getString("nombreApellido"));
		usuario.setCodigo(jsonObject.getString("codigo"));
		usuario.setDni(jsonObject.getString("dni"));		

		modeloUsuario.insert(usuario);

		try {
			modeloUsuario.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
