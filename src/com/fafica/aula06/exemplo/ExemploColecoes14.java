package com.fafica.aula06.exemplo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploColecoes14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cores = {"Verde", "Amarelo", "Azul", "Branco", "Azul"};
		List<String> lista = Arrays.asList(cores);
		System.out.println(lista);
		
		Set<String> conjunto = new HashSet<>(lista);
		System.out.println(conjunto);

	}

}
