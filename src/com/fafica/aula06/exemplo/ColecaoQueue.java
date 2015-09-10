package com.fafica.aula06.exemplo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ColecaoQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Maurício");
		fila.add("Paulo");
		fila.add("Bial");
		System.out.println(fila);
		
		for(String mau: fila) {
			System.out.println(mau);
			//fila.remove();
		}
		System.out.println(fila);
		System.out.println("");
		Iterator it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(fila);
	}

}
