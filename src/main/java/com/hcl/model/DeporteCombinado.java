package com.hcl.model;

public class DeporteCombinado extends Deporte {
	
	private Deporte dep1;
	private Deporte dep2;
	

	public DeporteCombinado(TipoDeporte tip) {
		super(tip);
		// TODO Auto-generated constructor stub
	}


	public Deporte getDep1() {
		return dep1;
	}


	public void setDep1(Deporte dep1) {
		this.dep1 = dep1;
	}


	public Deporte getDep2() {
		return dep2;
	}


	public void setDep2(Deporte dep2) {
		this.dep2 = dep2;
	}

	
	
}
