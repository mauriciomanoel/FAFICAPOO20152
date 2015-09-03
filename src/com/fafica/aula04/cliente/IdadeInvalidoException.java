package com.fafica.aula04.cliente;

public class IdadeInvalidoException extends Exception {
	public IdadeInvalidoException() {
		super("Você precisa ter 18 anos ou mais.");
	}
}
