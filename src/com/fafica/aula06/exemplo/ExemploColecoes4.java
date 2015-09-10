package com.fafica.aula06.exemplo;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class ExemploColecoes4 {
	public static void main(String[] args) {
		TreeSet colecaoSet = new TreeSet<>();
		colecaoSet.add("M");
		colecaoSet.add("A");
		colecaoSet.add("U");
		colecaoSet.add("U");
		System.out.println(colecaoSet.toString());
		System.out.println(colecaoSet.isEmpty());
		System.out.println(colecaoSet.contains("U"));
		colecaoSet.remove("U");
		System.out.println(colecaoSet.toString());
	}
}


