package com.fafica.aula05.exemplo;

public class MetodoGenerico {

	public static void main(String[] args) {
		Integer[] arrayInt = {1,1,2,3,5};
        Double[] arrayDouble = {1.1,6.2,7.3,6.6,9.9};
        String[] arrayString = {"Do","Re","Mi","Fa","So"};
        System.out.print("Array de Inteiro : ");
        imprimeArray(arrayInt);
        System.out.print("Array de Double : ");
        imprimeArray(arrayDouble);
        System.out.print("Array de String : ");
        imprimeArray(arrayString);
	}

	public static < E > void imprimeArray(E[] array){
        for (E elemento : array)
        System.out.print(elemento+" ");
        System.out.println();
   }
}
