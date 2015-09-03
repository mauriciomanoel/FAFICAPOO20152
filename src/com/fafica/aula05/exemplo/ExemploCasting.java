package com.fafica.aula05.exemplo;
import java.util.ArrayList;
public class ExemploCasting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5.5); 
		list.add(3.0); 
		list.add("Aloha");
		Double d = (Double) list.get(1); 
		System.out.println(d);
	}
}
