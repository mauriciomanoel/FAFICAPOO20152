package com.fafica.aula13.exemplo;
import java.util.concurrent.Semaphore;
public class Carro extends Thread{
	private static Semaphore estacionamento = new Semaphore(10,true);
	public Carro(String nome) { 
		super(nome); 
	}
	public void run() {
		try {
			estacionamento.acquire();
			System.out.println(getName() + " ocupou vaga.");
			sleep((long)(Math.random() * 10000));
			System.out.println(getName() + " liberou vaga.");
			estacionamento.release();
		} catch(InterruptedException ie){ ie.printStackTrace(); }
	}
	public static void main(String[] args) {
		for (int i = 1; i<= 20; i++){
			new Carro("Carro #"+i).start();
		}
	}
}


