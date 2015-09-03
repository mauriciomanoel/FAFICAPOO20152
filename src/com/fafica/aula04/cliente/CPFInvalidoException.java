package com.fafica.aula04.cliente;

public class CPFInvalidoException extends Exception {
	private String cpf;
	
	public CPFInvalidoException(String cpf) {
		super("CPF " + cpf + " Nulo ou Inv�lido");
		this.cpf = cpf;
	}
}
