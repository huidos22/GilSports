package com.hcl.exception;

public class YoyaMeRetire extends Exception {
	
	@Override
	public String getMessage() {
		
		return "este Juagador esta betabel es de la momiza";
	}
	@Override
	public String getLocalizedMessage() {
		
		return "Linea del Error" + super.getLocalizedMessage();
	}

}
