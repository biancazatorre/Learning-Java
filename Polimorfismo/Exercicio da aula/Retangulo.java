package com.aula;

public class Retangulo extends Quadrilatero {
	private double lado2;
	public Retangulo(double lado, double lado2) {
		super(lado);
		this.lado2 = lado2;
		
	}
	
	@Override
	public double calcularArea () {
		return getLado() * lado2;	}
	
	@Override
	public double calcularPerimetro () {
		return getLado()* 2 + lado2 *2;
	}
}
