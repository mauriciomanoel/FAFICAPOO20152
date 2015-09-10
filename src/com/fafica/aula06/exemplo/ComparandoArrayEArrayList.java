package com.fafica.aula06.exemplo;
import java.util.ArrayList;
public class ComparandoArrayEArrayList {
	public static void main(String[] args) {
		int a = 3;
		// inicialização:
		String[][] ola1;
		ArrayList<String> ola2 = new ArrayList<String>();
		
		ola2.add("o"); 
		ola2.add("l"); 
		ola2.add("a"); 
		ola2.add("!");
		ola2.add("!");
		ola2.add("!");
		ola2.add("!");
		ola2.add("!");
		ola2.add(0, "M");
		
		System.out.println(ola2);
		// percorrendo com for
		/*
		for (String s: ola1) {
			System.out.print(s);
		}
		System.out.println();
		for (String s: ola2) {
			System.out.print(s);
		}
		*/
	}
}
