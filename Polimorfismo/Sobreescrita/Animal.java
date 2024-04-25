package com.aula;

// SOBRECARGA (OVERLOAD) PERMITE USARMOS NOMES DE METODOS IGUAIS DESDE QUE MUDEMOS A LISTA DE PARAMETROS
// OBS: É VÁLIDO PARA CONSTRUTORES
// OQ NAO INFLUI NA SOBRECARGA: 
// -MODIFICADOR DE ACESSO  
// -TIPO DO RETORNO = EXEMPLO: VOID METODO () OU INT METODO ()
// -CLAUSULA THROWS (TRY/CATCH)
// -PRESENÇA DE ANNOTATIONS

public class Animal {
	private String nome;
	
	public Animal (String nome) {
		this.nome = nome;
	}
	
	public void emitirSom () {
		System.out.println("GENERICO!");
	}
	
	public void mostrar () {
		System.out.println(nome);
	}
}
