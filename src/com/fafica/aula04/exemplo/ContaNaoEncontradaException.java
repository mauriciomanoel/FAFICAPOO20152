package com.fafica.aula04.exemplo;
public class ContaNaoEncontradaException extends Exception {
	public ContaNaoEncontradaException() {
		super("Conta não Encontrada");
	}
}
