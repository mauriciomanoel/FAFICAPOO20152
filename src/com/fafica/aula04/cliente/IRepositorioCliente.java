/*
* IRepositorioCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package com.fafica.aula04.cliente;
import java.util.ArrayList;
import com.fafica.aula04.cliente.ClienteNaoEncontradoException;

public interface IRepositorioCliente {
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException;
	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException;
	public void remover(String cpf) throws ClienteNaoEncontradoException;
	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException;
	public boolean existe(String cpf);
	public ArrayList<Cliente> listar();
}
