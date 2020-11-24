package com.ejercicio.claseImpl;

import com.ejercicio.claseService.Clase;

public class ClaseA implements Clase{

	@Override
	public String hazAlgo() {
		ClaseB claseB = new ClaseB();
		System.out.println("Soy Clase(A) llamo a Clase(B)");
		return claseB.hazAlgo();
	}

}
