package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

/**
 * Servlet implementation class ModificarActividad
 */
@WebServlet("/ModificarActividad")
public class ModificarActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idActividad=Integer.parseInt(request.getParameter("id"));
		String nombre=request.getParameter("nombre");
		Date fechaInicio=null;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			fechaInicio = simpleDateFormat.parse(request.getParameter("fecha_inicio"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String diasSemana=request.getParameter("dias_semana");
		int horas=Integer.parseInt(request.getParameter("horas"));
		int maxParticipantes=Integer.parseInt(request.getParameter("max_participantes"));
		Double precio=Double.parseDouble(request.getParameter("precio"));
		
		Actividad actividad=new Actividad();
		
		actividad.setId(idActividad);
		actividad.setNombre(nombre);
		actividad.setFecha_inicio(fechaInicio);
		actividad.setDias(diasSemana);
		actividad.setHoras(horas);
		actividad.setMaxParticipantes(maxParticipantes);
		actividad.setPrecio(precio);
		
		ModeloActividad modeloActividad=new ModeloActividad();
		
		modeloActividad.update(actividad);
		
		response.sendRedirect("VerActividad?id=" + idActividad);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}