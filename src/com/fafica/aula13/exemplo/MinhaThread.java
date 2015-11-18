package com.fafica.aula13.exemplo;
public class MinhaThread extends Thread {
	private String mensagem;
	public MinhaThread(String mensagem) {
		this.mensagem = mensagem;
	}
	public void run() {
		for(int r=0; r<20; r++) {
			System.out.println(this.mensagem);
		}
	}
	public static void main(String[] args) {
		MinhaThread t1,t2;
		t1 = new MinhaThread("primeiro thread");
		t2 = new MinhaThread("segundo thread");
		t1.start();
		t2.start();
	}
}
