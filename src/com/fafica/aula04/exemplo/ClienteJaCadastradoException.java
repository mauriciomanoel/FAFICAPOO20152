package com.fafica.aula04.exemplo;
public class ClienteJaCadastradoException extends Exception {
	public ClienteJaCadastradoException() {
		super("Cliente Já Foi Cadastrado.");
	}
	public ClienteJaCadastradoException(String msg) {
		super(msg);
	}
}
