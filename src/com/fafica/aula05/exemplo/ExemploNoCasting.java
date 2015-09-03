package com.fafica.aula05.exemplo;
import java.util.ArrayList;
public class ExemploNoCasting {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(5.5); 
		list.add(3.0); 
		Double d = list.get(1); 
		System.out.println(d);
	}
}
