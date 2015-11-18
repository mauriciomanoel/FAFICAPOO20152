package com.fafica.aula13.exemplo;
public class HelloWorldThread implements Runnable {
	public void run() {
		System.out.println("Hello World");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldThread h = new HelloWorldThread();
		Thread t = new Thread(h);
		t.start();
	}
}
