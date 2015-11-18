package com.fafica.aula13.exemplo;
public class ComprasEmFamilia implements Runnable {
	ContaConjunta conta = new ContaConjunta();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComprasEmFamilia irAsCompras =  new ComprasEmFamilia();
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
