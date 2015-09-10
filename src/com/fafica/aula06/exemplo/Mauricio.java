package com.fafica.aula06.exemplo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
public class Mauricio {

	public static void main(String[] args) {
		List<Integer> set = new ArrayList<Integer>();
		set.add(3);
		set.add(9);
		set.add(10);
		set.add(9);
		set.add(1);
		set.remove(1);
		for(Integer i: set) {
			System.out.println(i);	
		}
		
	}

}
