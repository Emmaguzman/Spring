package com.EmmaSpring.Demo_Uno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HolaAplicacionSpring {
	public static void main(String[] args) {
		//cargar el archivo de configuracion de Spring
			ClassPathXmlApplicationContext contex=new ClassPathXmlApplicationContext("applicationContext.xml");
		//recuperar un x del contenedor de Spring
		Entrenador ent=contex.getBean("Entrenador",Entrenador.class);
		//Llamar a los metodos del beans	
		System.out.println(ent.getEntrenamientoDiario());
		
		System.out.println(ent.getFortunaDiaria());
		// cerrar contexto 
		contex.close();
	}

}
