package modelo.bean;

public class Inscripcion {
	private int id;
	private Usuario usuario;
	private Actividad actividad;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(final Usuario usuario) {
		this.usuario = usuario;
	}

	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(final Actividad actividad) {
		this.actividad = actividad;
	}
}