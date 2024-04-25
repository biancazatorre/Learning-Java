package com.aula;

public class Validador {
	
	//Type-driven
	
	public static boolean validar (Email email) {
		String valor = email.valor();
		return valor.contains("@");
	}
	
	public static boolean validar (Nome nome) {
		return !nome.valor().equals("");
	}
}
