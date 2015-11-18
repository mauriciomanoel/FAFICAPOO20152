package com.fafica.aula13.exemplo;

public class PonteTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ponte ponte = new PonteSincronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
	}

}
