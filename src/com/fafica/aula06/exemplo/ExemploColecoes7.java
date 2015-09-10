package com.fafica.aula06.exemplo;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class ExemploColecoes7 {
	public static void main(String[] args) {
		List colecaoVector = new LinkedList();
		colecaoVector.add("M");
		colecaoVector.add("A");
		colecaoVector.add("U");
		colecaoVector.add("U");
		System.out.println(colecaoVector.toString());
		System.out.println(colecaoVector.isEmpty());
		System.out.println(colecaoVector.contains("U"));
		colecaoVector.remove("U");
		System.out.println(colecaoVector.toString());
	}
}

