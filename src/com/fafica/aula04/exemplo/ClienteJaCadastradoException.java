package com.fafica.aula04.exemplo;
public class ClienteJaCadastradoException extends Exception {
	public ClienteJaCadastradoException() {
		super("Cliente J� Foi Cadastrado.");
	}
	public ClienteJaCadastradoException(String msg) {
		super(msg);
	}
}
