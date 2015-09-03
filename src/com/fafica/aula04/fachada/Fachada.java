/*
* Fachada.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package com.fafica.aula04.fachada;
import java.util.ArrayList;

import com.fafica.aula04.cliente.CPFInvalidoException;
import com.fafica.aula04.cliente.Cliente;
import com.fafica.aula04.cliente.ClienteJaCadastradoException;
import com.fafica.aula04.cliente.ClienteNaoEncontradoException;
import com.fafica.aula04.cliente.ControladorCliente;
import com.fafica.aula04.cliente.IdadeInvalidoException;
import com.fafica.aula04.util.CampoObritarorioInvalidoException;
import com.fafica.aula04.endereco.EnderecoJaCadastradoException;
import com.fafica.aula04.endereco.EnderecoNaoEncontradoException;

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
	* Método para cria uma unica instancia da classe Fachada
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
	* Método para cadastrar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteJaCadastradoException 
	* @throws CPFInvalidoException 
	* @throws IllegalArgumentException 
	* @throws CampoObritarorioInvalidoException 
	* @throws IdadeInvalidoException 
	 * @throws EnderecoJaCadastradoException 
	*/
	public void cadastrarCliente(Cliente cliente) throws IllegalArgumentException, CPFInvalidoException, ClienteJaCadastradoException, CampoObritarorioInvalidoException, IdadeInvalidoException, EnderecoJaCadastradoException { 
		this.controladorCliente.cadastrar(cliente);
		
	}
	
	/**
	* Método para atualizar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteNaoEncontradoException 
	* @throws CampoObritarorioInvalidoException 
	* @throws CPFInvalidoException  
	 * @throws EnderecoNaoEncontradoException 
	*/
	public void atualizarCliente(Cliente cliente) throws CPFInvalidoException, CampoObritarorioInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorCliente.atualizar(cliente);
	}
	
	/**
	* Método para remover os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Booleano
	* @throws ClienteNaoEncontradoException 
	* @throws CPFInvalidoException
	 * @throws EnderecoNaoEncontradoException 
	 * @throws CampoObritarorioInvalidoException 
	*/
	public void removerCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException { 
		this.controladorCliente.remover(cpf);
	}
	
	/**
	* Método para procurar os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Retorna um objeto da Classe Cliente
	* @throws ClienteNaoEncontradoException 
	* @throws CPFInvalidoException 
	 * @throws EnderecoNaoEncontradoException 
	*/
	public Cliente procurarCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		return this.controladorCliente.procurar(cpf);
	}
	
	/**
	* Método para lista todos os dados do Cliente
	*
	* @param 
	* @return Retorna uma coleção de objetos da Classe Cliente
	* @throws 
	*/
	public ArrayList<Cliente> listarCliente() { 
		return this.controladorCliente.listar();
	}
}
