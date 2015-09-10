package com.fafica.aula06.exemplo;

import java.util.Stack;

public class ExemploPilha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.add("Maurício");
		pilha.add("Paulo");
		pilha.add("Emiliane");
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		
	}

}
