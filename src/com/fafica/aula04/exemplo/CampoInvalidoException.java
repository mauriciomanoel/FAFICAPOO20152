package com.fafica.aula04.exemplo;

public class CampoInvalidoException extends Exception {
	public CampoInvalidoException(String mensagem) {
		super("Campo " + mensagem + " nulo ou inválido. :D :D :D ");
	}

}
