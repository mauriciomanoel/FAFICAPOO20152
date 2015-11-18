package com.fafica.aula13.exemplo;
public class HelloWorldRunnable extends Thread {
	public void run() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldRunnable t = new HelloWorldRunnable();
		t.start();
	}
}
