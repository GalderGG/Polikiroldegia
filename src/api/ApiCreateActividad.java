package api;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import modelo.bean.Actividad;
import modelo.bean.Usuario;
import modelo.dao.ModeloActividad;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiCreateActividad
 */
@WebServlet("/ApiCreateActividad")
public class ApiCreateActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCreateActividad() {
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
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		request.setCharacterEncoding("UTF-8");
		String jsonActividad = request.getParameter("actividad");
		
		JSONObject jsonObject = new JSONObject(jsonActividad);
		
		Actividad actividad = new Actividad();
		actividad.setNombre(jsonObject.getString("nombre"));
		try {
			actividad.setFecha_inicio(simpleDateFormat.parse(jsonObject.getString("fechaInicio")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		actividad.setDias(jsonObject.getString("dias"));
		actividad.setHoras(Integer.parseInt(jsonObject.getString("horas")));
		actividad.setMaxParticipantes(Integer.parseInt(jsonObject.getString("maxParticipantes")));
		actividad.setPrecio(Double.parseDouble(jsonObject.getString("precio")));
		
		ModeloActividad modeloActividad = new ModeloActividad();
		modeloActividad.insert(actividad);
		
		try {
			modeloActividad.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setHeader("Access-Control-Allow-Origin", "*");
	}

}
