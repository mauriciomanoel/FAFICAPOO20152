package com.fafica.aula02.cliente;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String cpf;

	public Cliente(int codigo, String nome, String cpf) {
		this.setCodigo(codigo);
		this.setNome(nome);
        this.setCpf(cpf);
	}

	public Cliente(String nome, String cpf) {
		this.setCodigo(0);
		this.setNome(nome);
        this.setCpf(cpf);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
	}

	public String formatarCpf() {
		return cpf.substring(0, 3) + '.' + cpf.substring(3, 6) + '.' + 
			   cpf.substring(6, 9)+ '-' + cpf.substring(9, 11)
				;
	}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + this.formatarCpf()
				+ "]";
	}
}
