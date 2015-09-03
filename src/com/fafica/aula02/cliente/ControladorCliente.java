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
		// Validações da Classe Cliente		
		if (!ValidarCPF.validaCPF(cliente.getCpf())) System.out.println("CPF Inválido.");
		else if (cliente.getNome() == "") 			 System.out.println("Nome é nulo ou Inválido.");
		else {
			this.repositorioCliente.atualizar(cliente);
		}
	}
	public boolean remover(String cpf) {
		boolean retorno = false;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Cliente	
		if (!ValidarCPF.validaCPF(cpf)) System.out.println("CPF Inválido ou Nome esta em branco.");
		else {
			retorno = this.repositorioCliente.remover(cpf);
		}
		return retorno;
	}
	public Cliente procurar(String cpf) {
		Cliente cliente = null;
		
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) System.out.println("CPF Inválido");
		else {
			cliente = this.repositorioCliente.procurar(cpf);
		}
		return cliente;
	}
	public ArrayList<Cliente> listar() {
		return this.repositorioCliente.listar();
	}
}

