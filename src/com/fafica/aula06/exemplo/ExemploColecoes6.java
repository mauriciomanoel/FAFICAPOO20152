package com.fafica.aula06.exemplo;
import java.util.List;
import java.util.Vector;
public class ExemploColecoes6 {
	public static void main(String[] args) {
		List colecaoVector = new Vector();
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

