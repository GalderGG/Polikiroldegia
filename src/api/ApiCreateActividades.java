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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

/**
 * Servlet implementation class ApiCreateActividades
 */
@WebServlet("/ApiCreateActividades")
public class ApiCreateActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApiCreateActividades() {
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
		String jsonActividades = request.getParameter("actividades");

		JSONArray jsonArray = new JSONArray(jsonActividades);
		ModeloActividad modeloActividad = new ModeloActividad();

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);

			Actividad actividad = new Actividad();
			actividad.setNombre(jsonObject.getString("nombre"));

			Date date = null;
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			try {
				date = simpleDateFormat.parse(jsonObject.getString("fecha_inicio"));
			} catch (JSONException | ParseException e) {
				e.printStackTrace();
			}

			actividad.setFecha_inicio(date);
			actividad.setDias(jsonObject.getString("dias"));
			actividad.setHoras(jsonObject.getInt("horas"));
			actividad.setMaxParticipantes(jsonObject.getInt("maxParticipantes"));
			actividad.setPrecio(jsonObject.getDouble("precio"));

			modeloActividad.insert(actividad);
		}
		
		try {
			modeloActividad.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
