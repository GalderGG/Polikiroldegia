package modelo.bean;

import java.util.ArrayList;
import java.util.Date;

public class Actividad {
	private int id;
	private String nombre;
	private Date fecha_inicio;
	private String dias;
	private int horas;
	private int maxParticipantes;
	private double precio;
	private ArrayList<Inscripcion> iscripciones;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_inicio() {
		return this.fecha_inicio;
	}

	public void setFecha_inicio(final Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getDias() {
		return this.dias;
	}

	public void setDias(final String dias) {
		this.dias = dias;
	}

	public int getHoras() {
		return this.horas;
	}

	public void setHoras(final int horas) {
		this.horas = horas;
	}

	public int getMaxParticipantes() {
		return this.maxParticipantes;
	}

	public void setMaxParticipantes(final int maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(final double precio) {
		this.precio = precio;
	}

	public ArrayList<Inscripcion> getIscripciones() {
		return this.iscripciones;
	}

	public void setIscripciones(final ArrayList<Inscripcion> iscripciones) {
		this.iscripciones = iscripciones;
	}

	@Override
	public String toString() {
		return "Actividad [id=" + this.id + ", nombre=" + this.nombre + ", fecha_inicio=" + this.fecha_inicio
				+ ", dias=" + this.dias + ", horas=" + this.horas + ", maxParticipantes=" + this.maxParticipantes
				+ ", precio=" + this.precio + "]";
	}
}