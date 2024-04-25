package com.aula;

public class Gato extends Animal {

	
	public Gato(String nome) {
		super(nome);
	}

	@Override //se errar o nome do metodo, ele dá erro. Sem ele, o java ia criar um novo metodo, nao ia entender q vc ta chamando da class cachorro
	public void emitirSom () {
		System.out.println("MIAU");
	}
}
