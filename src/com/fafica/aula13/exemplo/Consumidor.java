package com.fafica.aula13.exemplo;

import java.util.Random;

public class Consumidor implements Runnable {
	
	private Ponte ponte;
	private Random random = new Random();
	
	public Consumidor(Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total += ponte.get();
				System.err.println("\t " + total);
			} catch (InterruptedException e) {}
		}
	}

}
