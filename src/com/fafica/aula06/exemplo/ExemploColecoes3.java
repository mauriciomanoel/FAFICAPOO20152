package com.fafica.aula06.exemplo;
import java.util.Collection;
import java.util.PriorityQueue;
public class ExemploColecoes3 {
	public static void main(String[] args) {
		Collection colecaoPriorityQueue = new PriorityQueue();
		colecaoPriorityQueue.add("M");
		colecaoPriorityQueue.add("A");
		colecaoPriorityQueue.add("U");
		colecaoPriorityQueue.add("U");
		System.out.println(colecaoPriorityQueue.toString());
		System.out.println(colecaoPriorityQueue.isEmpty());
		System.out.println(colecaoPriorityQueue.contains("U"));
		colecaoPriorityQueue.remove("U");
		System.out.println(colecaoPriorityQueue.toString());
	}
}

