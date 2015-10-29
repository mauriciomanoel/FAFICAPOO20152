package com.fafica.aula11.exemplo;
import java.io.Serializable;
public class Conta {
	private String nome;
	private Double saldo;
	public Conta(String nome, Double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "Nome: " + this.getNome() + " Saldo Atual: " + this.getSaldo();
	}
}
