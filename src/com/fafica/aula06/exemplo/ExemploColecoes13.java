package com.fafica.aula06.exemplo;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class ExemploColecoes13 {
public static void main(String[] args){
	Map<String, String> mapa = new TreeMap<String, String>();
	mapa.put("B", "Aluno 2");
	mapa.put("A", "Aluno 1");
	mapa.put("Z", "Aluno 3");
	mapa.put("C", "Aluno 4");
	mapa.put("G", "Aluno 5");
	System.out.println(mapa.containsKey("C"));
	System.out.println(mapa.toString());
	mapa.remove("Aluno 5");
	for(String i : mapa.keySet())
		System.out.print(mapa.get(i) + " ");
	}
}






