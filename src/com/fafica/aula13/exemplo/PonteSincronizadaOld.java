package com.fafica.aula13.exemplo;

public class PonteSincronizadaOld implements Ponte {

	private int valor = -1;

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		System.out.print("Produziu " + valor);
		this.valor = valor;
	}

	@Override
	public synchronized int get() throws InterruptedException {
		// TODO Auto-generated method stub
		System.err.print("Consumiu " + valor);
		return valor;
	}

}
