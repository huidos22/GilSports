package com.hcl.model;

import java.util.List;

public class Deporte extends Extremo {

	private Uniforme uniform;
	private List<Artefacto> artefactos;
	private Integer maxJugadores;
	private Integer minJugadores;
	private String nombre;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMaxJugadores() {
		return maxJugadores;
	}

	public void setMaxJugadores(Integer maxJugadores) {
		this.maxJugadores = maxJugadores;
	}

	public Integer getMinJugadores() {
		return minJugadores;
	}

	public void setMinJugadores(Integer minJugadores) {
		this.minJugadores = minJugadores;
	}

	public List<Artefacto> getArtefactos() {
		return artefactos;
	}

	public void setArtefactos(List<Artefacto> artefactos) {
		this.artefactos = artefactos;
	}

	public Uniforme getUniform() {
		return uniform;
	}

	public void setUniform(Uniforme uniform) {
		this.uniform = uniform;
	}

	public Deporte(TipoDeporte tip) {
		this.setTipo(tip);
	}

}
