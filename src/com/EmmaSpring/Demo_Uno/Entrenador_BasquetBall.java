package com.EmmaSpring.Demo_Uno;

public class Entrenador_BasquetBall implements Entrenador{
	
	private ServicioDeFortuna sf;
	
	public Entrenador_BasquetBall(ServicioDeFortuna servicioFortuna) {
		this.sf=servicioFortuna;
	}
	@Override 
	public String getEntrenamientoDiario() {
		return "Batear durante a 300 minutos un poste de luz";
	}

	@Override
	public String getFortunaDiaria() {
		//usar servicio de fortuna
		return sf.getFortuna();
	}

}
