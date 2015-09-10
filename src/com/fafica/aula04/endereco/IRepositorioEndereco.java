/*
* IRepositorioCliente.java
* Versão: 1.0
* Data de Criação : 12/08/2015
*
*/
package com.fafica.aula04.endereco;
import java.util.ArrayList;

public interface IRepositorioEndereco {
	public void cadastrar(Endereco endereco); 
	public void atualizar(Endereco endereco); 
	public void remover(Integer id); 
	public Endereco procurar(Integer id);
	public Endereco procurarPorCliente(Integer clienteId); 
	public boolean existe(Integer id);
	public ArrayList<Endereco> listar();
}
