package com.aula;

public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		super(lado);
	
	}

	public double calcularArea () {
		return getLado()*getLado();
	}
	
	public double calcularPerimetro () {
		return getLado()*4;
	}

}
