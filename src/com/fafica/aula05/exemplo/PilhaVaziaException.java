package com.fafica.aula05.exemplo;

public class PilhaVaziaException extends RuntimeException {
	public PilhaVaziaException() {
		super("Pilha está vazia, não é possível remover");
	}
	
	public PilhaVaziaException(String Message) {
		super(Message);
	}
}
