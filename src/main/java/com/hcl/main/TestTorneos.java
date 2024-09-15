package com.hcl.main;

import java.util.ArrayList;
import java.util.List;

import com.hcl.exception.YoyaMeRetire;
import com.hcl.model.Artefacto;
import com.hcl.model.Deporte;
import com.hcl.model.DeporteCombinado;
import com.hcl.model.Equipo;
import com.hcl.model.Extremo;
import com.hcl.model.Jugador;
import com.hcl.model.TipoDeporte;
import com.hcl.model.Torneo;
import com.hcl.model.Tradicional;
import com.hcl.model.Uniforme;

public class TestTorneos {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Extremo dext = new Extremo( 2,TipoDeporte.ACUATICO );
		Artefacto artExt = new Artefacto();
		artExt.setNombre("cuchillo");
		
		dext.getRiesgo();   //hay deportes  extremos que  pueden ser tradicionales cuando se les quita el riesgo
		System.out.println("Valor de riesgo "+dext.getRiesgo());
		//quitando riesgo
		Tradicional dtradFromExtremo= (Tradicional)dext;//downcasting
		//dtradFromExtremo.getRiesgo();// ya no existe el riesgo
		//un deporte tradicional nunca será extrema
		Tradicional dtrad = new Deporte(TipoDeporte.AEREO);
		
		//Tradicional dtradw = new Deporte(2,TipoDeporte.AEREO); un deporte tradicional nunca será extrema
		
		// los deportes que resultan de la combinación de 2 o mas deportes pueden usar piezas de esos uniformes
		
// los deportes que resultan de la combinación de 2 o mas deportes pueden usar piezas de esos uniformes
		Uniforme uni1 = new Uniforme();
		uni1.setJersey("santos");
		uni1.setShorts("azul puma");
		uni1.setZapatos("fosforecentes");
		
		Uniforme uni2 = new Uniforme();
		uni2.setJersey("cowboys nfl");
		uni2.setShorts("mayones NFL");
		
		
		DeporteCombinado depCom = new DeporteCombinado(TipoDeporte.AEREO);
		Uniforme uni3Comb = new Uniforme();
		uni3Comb.setJersey(uni1.getJersey());
		uni3Comb.setShorts(uni2.getShorts());
		depCom.setUniform(uni3Comb);
		
		//Crear torneo
		Torneo tor = new Torneo();
		Deporte deporte = new Deporte(TipoDeporte.TERRESTRE);
		deporte.setNombre("FUTBOL");
		deporte.setMaxJugadores(11);
		deporte.setMinJugadores(7);
		deporte.setUniform(uni1);
		
		tor.setDeporte(deporte);
		
		Equipo equi1 = new Equipo();
		equi1.setNombre("santos");
		Equipo equi21 = new Equipo();
		equi21.setNombre("atlas");
		
		List<Equipo> listaDeEquipos = new ArrayList<>();
		
		Jugador jug1 = new Jugador();
		try {
			jug1.setEdad(38);
		} catch (YoyaMeRetire e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		listaDeEquipos.add(equi21);
		listaDeEquipos.add(equi1);
		
		tor.setEquipos(listaDeEquipos);
		
		
		
		
	}

}
