package com.fafica.aula05.exemplo;

public class TestarPilha {
	public static void main(String[] args) {
		double[] doubleElemento = {1.1, 2.2, 3.3, 4.4, 5.5};
		int[] integerElemento = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		PilhaGenerica<Double> doublePilha = new PilhaGenerica<Double>();
		PilhaGenerica<Integer> integerPilha = new PilhaGenerica<Integer>();
		
		testPushDouble(doublePilha, doubleElemento);
		testPopDouble(doublePilha);
		testPushInteger(integerPilha, integerElemento);
		testPopInteger(integerPilha);
	}
	
	private static void testPushDouble(PilhaGenerica<Double> pilha, double[] valores) {
		System.out.println("\n Adicionando Elementos na Pilha Double ");
		for(double valor: valores) {
			System.out.printf("%.1f ", valor);
			pilha.push(valor);
		}
	}
	private static void testPopDouble(PilhaGenerica<Double> pilha) {
		try {
			System.out.println("\n Removendo Elementos na Pilha Double ");
			double popValor;
			
			while(true) {
				popValor = pilha.pop();
				System.out.printf("%.1f ", popValor);
			}
		} catch (PilhaVaziaException e) {
			System.out.println("");
			System.err.println(e.getMessage());
		}
	}
	
	private static void testPushInteger(PilhaGenerica<Integer> pilha, int[] valores) {
		System.out.println("\n Adicionando Elementos na Pilha Integer ");
		for(int valor: valores) {
			System.out.printf("%d ", valor);
			pilha.push(valor);
		}
	}
	private static void testPopInteger(PilhaGenerica<Integer> pilha) {
		try {
			System.out.println("\n Removendo Elementos na Pilha Integer ");
			int popValor;
			
			while(true) {
				popValor = pilha.pop();
				System.out.printf("%d ", popValor);
			}
		} catch (PilhaVaziaException e) {
			System.out.println("");
			System.err.println(e.getMessage());
		}
	}
}
