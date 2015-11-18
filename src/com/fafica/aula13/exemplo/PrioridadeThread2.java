package com.fafica.aula13.exemplo;
public class PrioridadeThread2 extends Thread {
	Thread thread = new Thread();
    public PrioridadeThread2() {
            thread = new Thread(this);
            thread.start();
    }
    public void run() {
            System.out.println("Prioridade Atual : " 
            				+ thread.getPriority());
            thread.setPriority(Thread.MAX_PRIORITY);            
            System.out.println("Nova Prioridade : " 
            				+ thread.getPriority());
            
            thread.setPriority(Thread.MIN_PRIORITY);
            System.out.println("Nova Prioridade : " 
            				+ thread.getPriority());
            
            thread.setPriority(Thread.NORM_PRIORITY);
            System.out.println("Nova Prioridade : " 
            				+ thread.getPriority());
    }
    public static void main(String[] args) {
            new PrioridadeThread2();
    }
}

