package com.fafica.aula05.exemplo;

public class TestarPilha2 {
	public static void main(String[] args) {
		Double[] doubleElemento = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElemento = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		PilhaGenerica<Double> doublePilha = new PilhaGenerica<Double>();
		PilhaGenerica<Integer> integerPilha = new PilhaGenerica<Integer>();
		testPush("Double", doublePilha, doubleElemento);
		testPop("Double",doublePilha);
		
		testPush("Integer", integerPilha, integerElemento);
		testPop("Integer", integerPilha);
	}
	
	private static <T> void testPush(String nome, PilhaGenerica<T> pilha, T[] valores) {
		System.out.printf("\n Adicionando Elementos na Pilha %s\n ", nome);
		for(T valor: valores) {
			System.out.printf("%s ", valor);
			pilha.push(valor);
		}
	}
	private static <T> void testPop(String nome, PilhaGenerica<T> pilha) {
		try {
			System.out.println("\n Removendo Elementos na Pilha Double ");
			T popValor;
			
			while(true) {
				popValor = pilha.pop();
				System.out.printf("%s ", popValor);
			}
		} catch (PilhaVaziaException e) {
			System.out.println("");
			System.err.println(e.getMessage());
		}
	}
}
