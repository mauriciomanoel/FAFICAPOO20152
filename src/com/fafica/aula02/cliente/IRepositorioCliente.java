/*
* IRepositorioCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package com.fafica.aula02.cliente;
import java.util.ArrayList;

public interface IRepositorioCliente {
	public void cadastrar(Cliente cliente);
	public void atualizar(Cliente cliente);
	public boolean remover(String cpf);
	public Cliente procurar(String cpf);
	public boolean existe(String cpf);
	public ArrayList<Cliente> listar();
}
