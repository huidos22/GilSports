package com.hcl.model;

public  class Extremo implements Tradicional{
	
	private Integer riesgo;
	private TipoDeporte tipo;
	
	public TipoDeporte getTipo() {
		return tipo;
	}

	public Extremo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setTipo(TipoDeporte tipo) {
		this.tipo = tipo;
	}

	public Extremo(Integer riesgo, TipoDeporte tipo) {
		super();
		this.tipo = tipo;
		this.riesgo = riesgo;
	}

	public Integer getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(Integer riesgo) {
		this.riesgo = riesgo;
	}

}
