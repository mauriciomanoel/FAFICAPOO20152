package com.fafica.aula13.exemplo;

public class ContaConjuntaSincronizada {
	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente) {
		int saldoAnterior = saldo;
		if (saldo >= valor) {
			System.out.println(cliente + " vai sacar");
			System.out.println(cliente + " ESPERANDO...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			saldo -= valor;
			String mensagem = cliente + " SACOU " + valor
					  	     + " [Saldo Original = " + saldoAnterior
					  	     + " [Saldo atual = " + getSaldo();
			System.out.println(mensagem);
		}
		else {
			System.out.println(cliente + " seu Saldo insuficiente. " + this.getSaldo());
		}
	}
	
}
