/*
* Fachada.java
* Vers�o: 1.0
* Data de Cria��o : 12/02/2015
*
*/
package com.fafica.aula02.fachada;
import java.util.ArrayList;

import com.fafica.aula02.cliente.Cliente;
import com.fafica.aula02.cliente.ControladorCliente;

public class Fachada {
	private static Fachada instance;
	private ControladorCliente controladorCliente;
	
	/**
	* Construtor privado da Classe Fachada 
	*
	* @param 
	* @return void
	* @throws 
	*/
	private Fachada() {
		this.controladorCliente = new ControladorCliente();
	}

	/**
	* M�todo para cria uma unica instancia da classe Fachada
	*
	* @param 
	* @return Retorna um objeto da Classe Fachada
	* @throws 
	*/
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	/**
	* M�todo para cadastrar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
	public void cadastrarCliente(Cliente cliente) { 
		controladorCliente.cadastrar(cliente);
	}
	
	/**
	* M�todo para atualizar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
	public void atualizarCliente(Cliente cliente) { 
		this.controladorCliente.atualizar(cliente);
	}
	
	/**
	* M�todo para remover os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Booleano
	* @throws 
	*/
	public boolean removerCliente(String cpf) { 
		return this.controladorCliente.remover(cpf);
	}
	
	/**
	* M�todo para procurar os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Retorna um objeto da Classe Cliente
	* @throws 
	*/
	public Cliente procurarCliente(String cpf) { 
		return this.controladorCliente.procurar(cpf);
	}
	
	/**
	* M�todo para lista todos os dados do Cliente
	*
	* @param 
	* @return Retorna uma cole��o de objetos da Classe Cliente
	* @throws 
	*/
	public ArrayList<Cliente> listarCliente() { 
		return this.controladorCliente.listar();
	}
}
