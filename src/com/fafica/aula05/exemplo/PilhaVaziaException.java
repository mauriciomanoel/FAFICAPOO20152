package com.fafica.aula05.exemplo;

public class PilhaVaziaException extends RuntimeException {
	public PilhaVaziaException() {
		super("Pilha est� vazia, n�o � poss�vel remover");
	}
	
	public PilhaVaziaException(String Message) {
		super(Message);
	}
}
