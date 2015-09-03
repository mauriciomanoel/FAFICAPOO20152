package com.fafica.aula05.exemplo;
public class SobrecargaMetodoGenerico {
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.2, 1.2, 1.3, 1.4, 1.5, 1.6};
		Character[] characterArray = {'H','E','L','L','O'};
		
		System.out.println("Array de Inteiro Contem:");
		printArray(integerArray);
		System.out.println("Array de Double Contem:");
		printArray(doubleArray);
		System.out.println("Array de Character Contem:");
		printArray(characterArray);
	}
	// Método printArray para imprimir um array de Integer
	public static <E> void printArray(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("%S ", element);
		}
		System.out.println();
	}
}
