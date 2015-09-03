package com.fafica.aula02.cliente;
import java.util.ArrayList;
import com.fafica.aula02.util.ValidarCPF;

public class ControladorCliente {
	private IRepositorioCliente repositorioCliente;
	
	public ControladorCliente() {
		this.repositorioCliente = new RepositorioClienteArray();
	}
	public void cadastrar(Cliente cliente) {
			this.repositorioCliente.cadastrar(cliente);
	}
	
	public void atualizar(Cliente cliente) {
		// Valida��es da Classe Cliente		
		if (!ValidarCPF.validaCPF(cliente.getCpf())) System.out.println("CPF Inv�lido.");
		else if (cliente.getNome() == "") 			 System.out.println("Nome � nulo ou Inv�lido.");
		else {
			this.repositorioCliente.atualizar(cliente);
		}
	}
	public boolean remover(String cpf) {
		boolean retorno = false;
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Cliente	
		if (!ValidarCPF.validaCPF(cpf)) System.out.println("CPF Inv�lido ou Nome esta em branco.");
		else {
			retorno = this.repositorioCliente.remover(cpf);
		}
		return retorno;
	}
	public Cliente procurar(String cpf) {
		Cliente cliente = null;
		
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) System.out.println("CPF Inv�lido");
		else {
			cliente = this.repositorioCliente.procurar(cpf);
		}
		return cliente;
	}
	public ArrayList<Cliente> listar() {
		return this.repositorioCliente.listar();
	}
}

