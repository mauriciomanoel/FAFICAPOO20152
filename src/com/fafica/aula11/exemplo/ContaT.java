package com.fafica.aula11.exemplo;
import java.io.Serializable;
public class ContaT implements Serializable {
	// Guarda a vers�o em que a classe foi serializada
	private final static long serialVersionUID = 1L;
	private static int numeroCliente = 1;
	private String nome;
	private Double saldo;
	private transient String senha = null;
	public ContaT(String nome, Double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}	
	public ContaT(String nome, Double saldo, String senha) {
		this.nome = nome;
		this.saldo = saldo;
		this.senha = senha;
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
		return "Nome: " + this.getNome() + " Saldo Atual: " + this.getSaldo() + " Senha: " + this.getSenha();
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static int getNumeroCliente() {
		return numeroCliente;
	}
	public static void setNumeroCliente(int numeroCliente) {
		ContaT.numeroCliente = numeroCliente;
	}
}
