package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.List;
public class ExemploColecoes16 {
	public static void main(String[] args){
		List<String> lista;
		lista = new ArrayList<String>();
		lista.add("um");
		lista.add("três");
		lista.add(2);
		lista.add(1, "dois");
		String x = lista.get(0);
		lista.remove(2);
		System.out.println(x);
		for(String i : lista)
			System.out.print(i + " ");
	}
}

