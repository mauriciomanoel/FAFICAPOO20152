package com.fafica.aula05.exemplo;
// Objetivo: Mostrar a utilização de ArrayList sem o uso de generics
import java.util.ArrayList;

public class ExemploGenericoArrayList2 {

	public static void main(String[] args) {
		ArrayList <Integer> inteiros = new ArrayList<Integer>();
        inteiros.add(new Integer(2));
        inteiros.add(new Integer(4));
        inteiros.add("teste");
        Integer total = 0;
        for (int i = 0; i < inteiros.size(); i++)
            total+= inteiros.get(i);
        System.out.println("O total é : "+total);
	}

}
