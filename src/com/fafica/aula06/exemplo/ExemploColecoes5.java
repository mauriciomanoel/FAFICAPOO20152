package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ExemploColecoes5 {
	public static void main(String[] args) {
		ArrayList<String> colecaoList = new ArrayList<String>();
		colecaoList.add("M");
		colecaoList.add("A");
		colecaoList.add("U");
		colecaoList.add("U");
		System.out.println(colecaoList.toString());
		System.out.println(colecaoList.isEmpty());
		System.out.println(colecaoList.contains("U"));
		colecaoList.remove("U");
		System.out.println(colecaoList.toString());
		// Imprimindo cada Elemento
		for(String element: colecaoList) {
			System.out.println(element);
		}
		// A partir do Java 8
		colecaoList.forEach((string) -> {
			System.out.println("Content: " + string);
		});
		
	}
}