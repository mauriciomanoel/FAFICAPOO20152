package com.fafica.aula13.exemplo;

public class PonteSincronizada implements Ponte {

	private int valor = -1;
	private boolean ocupado = false;

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupado) {
			System.out.println("Ponte cheia. Produtor aguarde");
			wait(); // Avisa a todas as threads que aguardem até que a ponte esteja livre.
		}
		System.out.print("Produziu " + valor);
		this.valor = valor;
		ocupado = true;
		notifyAll(); // Avisa a todas as threads que podem continuar a execução.
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupado) {
			System.out.println("Ponte Vazia. Cosumidor aguardando...");
			wait();
		}
		System.err.print("Consumiu " + valor);
		ocupado = false;
		notifyAll(); // Avisa a todas as threads que podem continuar a execução
		return valor;
	}

}
