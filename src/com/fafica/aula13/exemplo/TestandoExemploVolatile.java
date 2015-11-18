package com.fafica.aula13.exemplo;

public class TestandoExemploVolatile extends Thread {

	public static void main(String[] args){
		new ExemploVolatile("Thread 1").start();
		new ExemploVolatile("Thread 2").start();
	}
}
