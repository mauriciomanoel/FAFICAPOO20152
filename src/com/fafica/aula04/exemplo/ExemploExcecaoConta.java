package com.fafica.aula04.exemplo;
public class ExemploExcecaoConta {
	public static void main(String[] args) {
		String numero = "9857-3";
		double saldo = 200.25;
		try {
			Conta conta = new Conta(numero, saldo);
			conta.debitar(numero, 100);
			System.out.println("Saque Realizado com Sucesso");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
