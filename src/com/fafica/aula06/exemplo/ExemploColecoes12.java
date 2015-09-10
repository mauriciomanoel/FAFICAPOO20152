package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ExemploColecoes12 {
	public static void main(String[] args){
		List<String> l = new ArrayList<>();
		l.add("m");
		l.add("a");
		l.add("a");
		l.add("u");
		l.add("z");
		l.add("0");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}

