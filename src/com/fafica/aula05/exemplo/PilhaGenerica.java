package com.fafica.aula05.exemplo;
import java.util.ArrayList;
public class PilhaGenerica <T> {
	private ArrayList<T> elemento;
	public PilhaGenerica() {
		elemento = new ArrayList<T>();
	}
	public void push(T pushValue) {
		elemento.add(pushValue);
	}
	public T pop() {
		if (elemento.isEmpty())
			throw new PilhaVaziaException();
		return elemento.remove(elemento.size() - 1);
	}
}
