package com.hcl.exception;
//Asi se crea una nueva excepcion en java
public class YoYanoJuego extends Exception {
	
// ejemplo de sobreescritura y sobrecarga
	@Override
	public String getMessage()  {
		return "Ya vali�, este jugador esta lesionado"+ super.getMessage();
	}
	
	
	public String getMessage(String oveload) {
		return oveload+ " Ya vali�, este jugador esta sdfsdflesionado"+ super.getMessage();
		
	}
	public String getMessage(Integer oveload) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		return oveload+ " Ya vali�, este jugador esta sdfsdfsdfsdfsdflesionado"+ super.getMessage();
		
	}
	public String getMessage(Integer oveload, String otro) {
		return oveload+ " Ya vali�, este jugador estsdfsdfdsfsdasdsfsdfa lesionado"+ super.getMessage();
		
	}
	public String getMessage(Integer oveload, String otro, boolean es) {
		return oveload+ " Ya vali�, este jugador esta ledsfsdfsdfsionado"+ super.getMessage();
		
	}

}
