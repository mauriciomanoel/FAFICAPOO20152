package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.Iterator;
public class ExemploColecoes11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno(20151,"Mauricio"));
		lista.add(new Aluno(20152,"Mateus"));
		lista.add(new Aluno(20159, "Andrade"));
		System.out.println(lista);
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
			it.remove();
		}
		System.out.println(lista);
	}
}


