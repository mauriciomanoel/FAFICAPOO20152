package com.fafica.aula05.exemplo;

import java.util.ArrayList;

public class ExemploGenericoArrayList1 {

	public static void main(String[] args) {
		ArrayList inteiros = new ArrayList();
        inteiros.add(new Integer(2));
        inteiros.add(new Integer(4));
        inteiros.add("teste");
        Integer total = 0;
        for (int i = 0; i < inteiros.size(); i++)
            total += (Integer) inteiros.get(i);
        System.out.println("O total � : "+total);
	}

}
