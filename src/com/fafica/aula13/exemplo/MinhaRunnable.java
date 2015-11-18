package com.fafica.aula13.exemplo;
public class MinhaRunnable implements Runnable {
	private String mensagem;
	public MinhaRunnable(String mensagem) {
		this.mensagem = mensagem;
	}
	public void run() {
		for(int r=0; r<20; r++) {
			System.out.println(this.mensagem);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MinhaRunnable r1,r2;
		Thread t1, t2;
		r1 = new MinhaRunnable("primeiro thread");
		r2 = new MinhaRunnable("segundo thread");
		t1 = new Thread(r1, "T1");
		t2 = new Thread(r2, "T2");
		t1.start();
		t2.start();
	}
}


