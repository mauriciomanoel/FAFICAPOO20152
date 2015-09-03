package com.fafica.aula04.exemplo;
public class Conta {
	private String numero;
	private double saldo;
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public void debitar(String numero, double valor) 
			throws SaldoInsuficienteException {
		
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
		this.saldo = this.saldo - valor;
	}
}
