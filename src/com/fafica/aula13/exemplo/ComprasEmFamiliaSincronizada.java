package com.fafica.aula13.exemplo;
public class ComprasEmFamiliaSincronizada implements Runnable {
	ContaConjuntaSincronizada conta = new ContaConjuntaSincronizada();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComprasEmFamiliaSincronizada irAsCompras =  new ComprasEmFamiliaSincronizada();
		new Thread(irAsCompras, "Marcos").start();
		new Thread(irAsCompras, "Namorada de Marcos").start();
		new Thread(irAsCompras, "Sogra de Marcos").start();
	}
	public void run() {
		// TODO Auto-generated method stub
		String cliente = Thread.currentThread().getName();
		for (int i=0; i<=5; i++) {
			conta.sacar(20, cliente);
			if (conta.getSaldo() <= 0) {
				System.out.println("Conta Estourou");
			}
		}
	}
}
