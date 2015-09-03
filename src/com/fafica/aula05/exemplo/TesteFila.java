package com.fafica.aula05.exemplo;

import java.util.Stack;

public class TesteFila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack fila = new Stack();
		fila.add(1);
		fila.add("Manoel");
		fila.add("coelho");
		fila.add("Jr");
		System.out.println(fila.size());
		System.out.println(fila.pop());
		System.out.println(fila.pop());
		System.out.println(fila.pop());
		System.out.println(fila.pop());

	}

}
