package com.aula;

public class Main {

	public static void main(String[] args) {
		Nome n = new Nome ("Bianca");
		Email e = new Email ("bianca@fatec.br");
		
		if (Validador.validar(e)) {
			System.out.println("Email valido");
		}
		else {
			System.out.println("Email nao valido");
		}
		
		if (Validador.validar(n)) {
			System.out.println("Nome valido");
		}
		else {
			System.out.println("Nome nao valido");
		}
	
	
	Cachorro c = new Cachorro ("REX");
	c.emitirSom();
	
	Gato g = new Gato ("Frajola");
	g.emitirSom();
	
	Animal a = new Animal ("x");
	a.emitirSom();
}
}