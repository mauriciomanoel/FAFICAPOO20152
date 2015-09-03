package com.fafica.aula05.exemplo;
public class SobrecargaMetodo {
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.2, 1.2, 1.3, 1.4, 1.5, 1.6};
		
		System.out.println("Array de Inteiro Contem:");
		printArray(integerArray);
		System.out.println("Array de Double Contem:");
		printArray(doubleArray);
	}
	
	// Método printArray para imprimir um array de Integer
	public static void printArray(Integer[] inputArray) {
		for (Integer element: inputArray) {
			System.out.printf("%S ", element);
		}
		System.out.println();
	}
	// Método printArray para imprimir um array de Double
	public static void printArray(Double[] inputArray) {
		for (Double element: inputArray) {
			System.out.printf("%S ", element);
		}
		System.out.println();
	}
	// Método printArray para imprimir um array de Character
	public static void printArray(Character[] inputArray) {
		// Exibe elementos do array
		for (Character element: inputArray) {
			System.out.printf("%S ", element);
		}
		System.out.println();
	}
	
}
