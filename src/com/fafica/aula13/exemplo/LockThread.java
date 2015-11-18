package com.fafica.aula13.exemplo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockThread extends Thread {
	final Lock lock = new ReentrantLock();
	public LockThread(String nome) {
		super(nome);
	}
    public void run() {
       do {
            try {
                if (lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println("locked thread " 
                        			+ Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } finally {
                        lock.unlock();
                        System.out.println("unlocked locked thread " 
                        			+ Thread.currentThread().getName());
                    }
                    break;
                } else {
                    System.out.println("unable to lock thread " 
                    				+ Thread.currentThread().getName()
		            + " will re try again");
                }
            } catch (InterruptedException e) {
	            e.printStackTrace();
            }
        } while (true);
    }
	public static void main(String[] args) {
		new LockThread("Thread1").start();
        new LockThread("Thread2").start();
	}
}
