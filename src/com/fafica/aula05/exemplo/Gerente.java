package com.fafica.aula05.exemplo;

public class Gerente extends Funcionario {
	private Integer totalFuncionario;
	public Gerente(String nome, Double salario, Integer tempoEmpresa, Integer totalFuncionario) {
		super(nome, salario, tempoEmpresa);
		this.setTotalFuncionario(totalFuncionario);
		// TODO Auto-generated constructor stub
	}
	
	public Integer getTotalFuncionario() {
		return totalFuncionario;
	}
	public void setTotalFuncionario(Integer totalFuncionario) {
		this.totalFuncionario = totalFuncionario;
	}

}
