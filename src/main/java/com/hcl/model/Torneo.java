package com.hcl.model;

import java.util.List;

import com.hcl.exception.DeporteNoPermitido;

public class Torneo {
	
	private static final double PREMIO = 1000000;
	private String nombre;
	private Deporte deporte;
	private List<Equipo> equipos;

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos12312) {
		this.equipos = equipos;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public void inscribir(Deporte deporte)throws DeporteNoPermitido {
		if(deporte.getNombre().equalsIgnoreCase(this.getDeporte().getNombre())){
			this.deporte = deporte;
		}else{
			throw new DeporteNoPermitido();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
