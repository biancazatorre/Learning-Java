package com.aula;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome); //Chama o construtor da classe de cima
	}
	@Override //se errar o nome do metodo, ele dá erro. Sem ele, o java ia criar um novo metodo, nao ia entender q vc ta chamando da class cachorro
	public void emitirSom () {
		System.out.println("AUAU");
	}
}
