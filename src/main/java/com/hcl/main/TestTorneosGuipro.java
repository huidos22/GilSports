package com.hcl.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hcl.exception.YoYanoJuego;
import com.hcl.exception.YoyaMeRetire;
import com.hcl.model.Artefacto;
import com.hcl.model.Deporte;
import com.hcl.model.Equipo;
import com.hcl.model.Extremo;
import com.hcl.model.Jugador;
import com.hcl.model.TipoDeporte;
import com.hcl.model.Torneo;
import com.hcl.model.Tradicional;
import com.hcl.model.Uniforme;

public class TestTorneosGuipro {

	public static void main (String... args){
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
		
		
		
		//Crear torneo
				Torneo tor = new Torneo();
				tor.setNombre("LIGA MX");
				Deporte deporte = new Deporte(TipoDeporte.TERRESTRE);
				deporte.setNombre("FUTBOL");
				deporte.setMaxJugadores(11);
				deporte.setMinJugadores(7);
				deporte.setUniform(uni1);
				
				tor.setDeporte(deporte);
				
				Equipo equi1 = new Equipo();
				equi1.setNombre("santos");
				Equipo equi2 = new Equipo();
				equi2.setNombre("atlas");
				
				List<Equipo> listaDeEquipos = new ArrayList<Equipo>();

				for (Equipo equipo : listaDeEquipos) {
					
				}
				listaDeEquipos.add(equi1);
				listaDeEquipos.add(equi2);
				tor.setEquipos(listaDeEquipos);
				Jugador jug1 = new Jugador();
				
				
				jug1.setNombre("SAUL");
				jug1.setFechaNacimiento(new Date());
				jug1.setNacionalidad("Mexicana");
				jug1.setLesion(1);
				List<Equipo> lstDepJug1 = new ArrayList();
				lstDepJug1.add(equi1);
				//jug1.setJugEquipos(lstDepJug1);
				
				
				
				Jugador jug2 = new Jugador();
				jug2.setNombre("OSCAR");
				jug2.setFechaNacimiento(new Date());
				jug2.setNacionalidad("Gringa");
				jug2.setLesion(2);
				List lstDepJug2 = new ArrayList();
				lstDepJug1.add(equi2);
				
				
				
				
				//jug1.setJugEquipos(lstDepJug2);
				
				System.out.println("Torneo  "+tor.getNombre());
				System.out.println(" deporte "+deporte.getNombre());
				System.out.println("  MaxJugadores "+deporte.getMaxJugadores());
				System.out.println("  MinJugadores "+deporte.getMinJugadores());
				System.out.println("  Riesgo "+deporte.getRiesgo());
				System.out.println("  equi1 "+equi1.getNombre());
				System.out.println("  equi2"+equi2.getNombre());
				System.out.println("  jug1 "+jug1.getNombre());
				System.out.println("  jug1 "+jug1.getNacionalidad());
				System.out.println("  jug1 "+jug1.getEdad());
				System.out.println("  jug1 "+jug1.getFechaNacimiento().toString());
				System.out.println("  jug2 "+jug2.getNombre());
				System.out.println("  jug2 "+jug2.getNacionalidad());
				System.out.println("  jug2 "+jug2.getEdad());
			
				System.out.println("  jug2 "+jug2.getFechaNacimiento().toString());
				
				
				Jugador jug3 = new Jugador();
				jug3.setNombre("OSCAR");
				jug3.setFechaNacimiento(new Date());
				jug3.setNacionalidad("Gringa");
				jug3.setLesion(2);
				
				
				try {
					jug3.lesionar();
					jug3.lesionar();
					jug3.setEdad(41);
					
				} catch (YoYanoJuego e) {
					System.out.println(e.getMessage());//overrides
					System.out.println(e.getMessage("Mando un letrrero de sobreescritura o nuevo comportamiento"));//oveload
					equi1.cambiarJugador(jug3,jug1);
				} catch (YoyaMeRetire e) {
					System.out.println(e.getMessage());
					System.out.println(e.getLocalizedMessage());
					equi1.crearHomenje(jug3);
				}finally{
					System.out.println("Yo siempre me ejecuto me vale merga");
				}
				
				
				System.out.println(jug3.toString());
				String s = "1";
				String s2 = "1";
				
				if (s.equals(s2)){
					
					System.out.println("mismo objeto");
				}else{
					System.out.println("nel ");
				}
		
				Integer s22 = 1;
				Integer s222 = 1;
				
				if (s22.equals(s222)){
					
					System.out.println("mismo objeto");
				}else{
					System.out.println("nel ");
				}
				
				
				if (jug1.equals(jug2)){
					
					System.out.println("mismo objeto");
				}else{
					System.out.println("nel ");
				}
		
		
	}

}
