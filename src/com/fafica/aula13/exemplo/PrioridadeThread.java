package com.fafica.aula13.exemplo;
public class PrioridadeThread extends Thread {
	Thread thread = new Thread();
    public PrioridadeThread() {
            thread = new Thread(this);
            thread.start();
    }
    public void run() {
            System.out.println("Prioridade Atual : " 
            			+ thread.getPriority());
            /* Setting thread priority */
            thread.setPriority(10);
            System.out.println("Nova Prioridade : " 
            			+ thread.getPriority());
    }
    public static void main(String[] args) {
            new PrioridadeThread();
    }
}

