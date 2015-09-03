package com.fafica.aula04.exemplo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExemploExcecao2 {
	public static void main(String[] args) {
		int a, b;
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com o Valor do Demonimador: ");
		a = ler.nextInt();
		System.out.print("Entre com o Valor do Divisor: ");
		b = ler.nextInt();
		System.out.print("O resultado é: " + a / b);
	}
}
