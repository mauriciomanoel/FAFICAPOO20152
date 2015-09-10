package com.fafica.aula06.exemplo;

import java.util.ArrayList;

public class ExemploLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		ArrayList lista2 = new ArrayList();
	    lista.add("M");
	    lista.add(0);
	    lista.add(1.0);
	    lista.add(false);
	    lista2.addAll(lista);
	    System.out.println(lista2);
	}

}
