package com.fafica.aula13.exemplo;

public class ExemploVolatile extends Thread {

	private volatile int testValue;
	
	  public ExemploVolatile(String str){
	    super(str);
	 }
	  
	 public void run() {
		for (int i = 0; i <=100; i++) {
		    try {
		    	System.out.println(getName() + ": " + i);
		    	if (getName().equals("Thread 1")){
		    		this.testValue++;
		    	}
		    	if (getName().equals("Thread 2")){
		    		System.out.println( "Test Value: " + this.testValue);
		    	}
		    	//System.out.println( "Test Value : " + this.testValue);
		    	Thread.sleep(1000);
		    } catch (InterruptedException exception) {
		        exception.printStackTrace();
		    }
		}
	}
}
