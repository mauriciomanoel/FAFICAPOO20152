package com.fafica.aula06.exemplo;
import java.util.HashSet;
import java.util.Set;
public class ExemploColecoes17 {
	public static void main(String[] args){
		Set<String> set;
		set = new HashSet<String>();
		set.add("3");
		set.add("9");
		set.add("10");
		set.add("9");
		set.add("1");
		set.remove(10);
		System.out.println(set.contains("10"));
		for(String i : set)  
			System.out.println(i);
	}
}


