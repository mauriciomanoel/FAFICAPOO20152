package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ExemploColecoes15 {
	public static void main(String[] args){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1); 
		lista.add(3); 
		//System.out.println(lista.size());
		int x = (int) lista.get(0);
		System.out.println(x);
		//lista.remove(2); 
		//System.out.println(lista);
		for(Integer i : lista) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for(x=0; x < lista.size(); x++) {
			System.out.print(lista.get(x) + " ");
		}
	}
}
