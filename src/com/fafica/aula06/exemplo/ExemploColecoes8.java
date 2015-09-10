package com.fafica.aula06.exemplo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class ExemploColecoes8 {
	public static void main(String[] args){
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(4, "Aluno 4");
		mapa.put(1, "Aluno 6");
		mapa.put(2, "Aluno 2");
		mapa.put(3, "Aluno 3");
		mapa.put(null, "Aluno 5");
		System.out.println(mapa.containsKey(5));
		System.out.println(mapa.toString());
		//mapa.remove(5);
		for(int i : mapa.keySet()) {
			System.out.print(mapa.get(i) + " ");
		}
	}
}





