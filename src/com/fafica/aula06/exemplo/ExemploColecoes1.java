package com.fafica.aula06.exemplo;
import java.util.Collection;
import java.util.HashSet;
public class ExemploColecoes1 {
	public static void main(String[] args) {
		Collection colecaoHashSet = new HashSet();
		colecaoHashSet.add("M");
		colecaoHashSet.add("A");
		colecaoHashSet.add("U");
		colecaoHashSet.add("U");
		System.out.println(colecaoHashSet.toString());
		System.out.println(colecaoHashSet.isEmpty());
		System.out.println(colecaoHashSet.contains("U"));
		colecaoHashSet.remove("U");
		System.out.println(colecaoHashSet.toString());
	}
}

