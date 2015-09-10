package com.fafica.aula06.exemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteArray {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		
			a1.add("a");
			a1.add("b");
			a1.add("c");
			
			a2.add("d");
			a2.add("e");
			a2.add("f");
		
		 Iterator i1 = a1.iterator();
		 while (i1.hasNext()) {
			 System.out.println(i1.next());
		 }
		
		 Iterator i2 = a2.iterator();
		 while (i2.hasNext()) {
			 System.out.println(i2.next());
		 }
	 }
 }