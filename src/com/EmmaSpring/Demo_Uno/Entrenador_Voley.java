package com.EmmaSpring.Demo_Uno;

public class Entrenador_Voley implements Entrenador {

private ServicioDeFortuna sf;
	
	public Entrenador_Voley(ServicioDeFortuna servicioFortuna) {
		this.sf=servicioFortuna;
	}
	@Override
	public String getEntrenamientoDiario() {
		
		return "JUGAR MUCHO AL VOLEY WACHIM! NIM";
	}

	@Override
	public String getFortunaDiaria() {
		// TODO Auto-generated method stub
		return sf.getFortuna();
	}

}
