package com.fafica.aula05.exemplo;
import java.util.ArrayList;
public class FilaGenerica <T> {
	private ArrayList<T> elemento;
	public FilaGenerica() {
		elemento = new ArrayList<T>();
	}
	public void add(T addValue) {
		elemento.add(addValue);
	}
	public T pool() {
		if (elemento.isEmpty())
			throw new PilhaVaziaException();
		return elemento.remove(0);
	}
	public T peek() {
		return elemento.get(0);
	}
	public int size() {
		return elemento.size();
	}
}
