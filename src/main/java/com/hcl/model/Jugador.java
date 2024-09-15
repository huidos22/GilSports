package com.hcl.model;

import java.util.Date;
import java.util.List;

import com.hcl.exception.SoloUnEquipo;
import com.hcl.exception.YoYanoJuego;
import com.hcl.exception.YoyaMeRetire;

public class Jugador {

	private Integer edad;
	private String nombre;
	private Date fechaNacimiento;
	private String nacionalidad;
	private List<? extends Tradicional> deportes;
	private List<Equipo> jugEquipos;
	private int lesion = 0;

	public int getLesion() {
		return lesion;
	}

	public void setLesion(int lesion) {
		this.lesion = lesion;
	}

	public List<Equipo> getJugEquipos() {
		return jugEquipos;
	}

	public void setJugEquipos(List<Equipo> jugEquipos) throws SoloUnEquipo, YoyaMeRetire {

		if (this.getEdad() >= 40 && jugEquipos.size() > 2) {
			throw new SoloUnEquipo();
		} else {
			this.jugEquipos = jugEquipos;
		}

	}

	public List<? extends Tradicional> getDeportes() {
		return deportes;
	}

	public void setDeportes(List<? extends Tradicional> deportes) {
		this.deportes = deportes;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) throws YoyaMeRetire {
		if (edad >= 40) {
			throw new YoyaMeRetire();

		} else {
			this.edad = edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/** si el jugador se lesiona 3 veces ya no puede jugar **/
	public void lesionar() throws YoYanoJuego {
		if (this.lesion == 3) {
			throw new YoYanoJuego();
		} else {
			this.lesion++;
		}
	}

	@Override
	public String toString() {
		return "Jugador [edad=" + edad + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", deportes=" + deportes + ", jugEquipos=" + jugEquipos
				+ ", lesion=" + lesion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deportes == null) ? 0 : deportes.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((jugEquipos == null) ? 0 : jugEquipos.hashCode());
		result = prime * result + lesion;
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (deportes == null) {
			if (other.deportes != null)
				return false;
		} else if (!deportes.equals(other.deportes))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (jugEquipos == null) {
			if (other.jugEquipos != null)
				return false;
		} else if (!jugEquipos.equals(other.jugEquipos))
			return false;
		if (lesion != other.lesion)
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
}
