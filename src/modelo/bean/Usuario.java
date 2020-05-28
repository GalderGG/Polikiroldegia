package modelo.bean;

import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nombreApellido;
	private String dni;
	private String codigo;
	private ArrayList<Inscripcion> inscripciones;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getNombreApellido() {
		return this.nombreApellido;
	}

	public void setNombreApellido(final String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(final String dni) {
		this.dni = dni;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Inscripcion> getInscripciones() {
		return this.inscripciones;
	}

	public void setInscripciones(final ArrayList<Inscripcion> inscripciones) {
		this.inscripciones = inscripciones;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + this.id + ", nombreApellido=" + this.nombreApellido + ", dni=" + this.dni + ", codigo="
				+ this.codigo + "]";
	}
}