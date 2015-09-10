package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.Collection;
public class ExemploColecoes2 {
	public static void main(String[] args) {
		Collection colecaoArrayList = new ArrayList();
		colecaoArrayList.add("M");
		colecaoArrayList.add("A");
		colecaoArrayList.add("U");
		colecaoArrayList.add("U");
		System.out.println(colecaoArrayList.toString());
		System.out.println(colecaoArrayList.isEmpty());
		System.out.println(colecaoArrayList.contains("U"));
		colecaoArrayList.remove("U");
		System.out.println(colecaoArrayList.toString());
	}
}


