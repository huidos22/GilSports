package com.hcl.model;

import com.hcl.cifrado.Cifrado;

public class Equipo {
	private String nombre;
	private String nombreCifrado;

	public String getNombreCifrado() {
		return nombreCifrado;
	}

	public void setNombreCifrado(String nombreCifrado) {
		
		Cifrado cif = new Cifrado();
		this.nombreCifrado = cif.Encriptar(nombreCifrado);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void cambiarJugador(Jugador sad, Jugador jug1) {
		
		System.out.println("Cambiando jugador <--- sale:  " + sad.getNombre());
		System.out.println(" **** Alguna logica de juego *** ");
		System.out.println("Cambiando jugador ---> ENTRA:  " + jug1.getNombre());
		
	}

	public void crearHomenje(Jugador jug3) {
		System.out.println("**** FELICIDADES POR TU TRAYECTORIA ****");
		System.out.println(" nombre "+ jug3.getNombre());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreCifrado == null) ? 0 : nombreCifrado.hashCode());
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
		Equipo other = (Equipo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreCifrado == null) {
			if (other.nombreCifrado != null)
				return false;
		} else if (!nombreCifrado.equals(other.nombreCifrado))
			return false;
		return true;
	}
	

}
