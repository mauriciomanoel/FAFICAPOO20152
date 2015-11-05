/*
* IRepositorioCliente.java
* Versão: 1.0
* Data de Criação : 12/08/2015
*
*/
package com.fafica.aula04.endereco;
import java.util.ArrayList;

public interface IRepositorioEndereco {
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException; 
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException; 
	public void remover(Integer id) throws EnderecoNaoEncontradoException; 
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException;
	public Endereco procurarPorCliente(Integer clienteId) throws EnderecoNaoEncontradoException; 
	public boolean existe(Integer id);
	public ArrayList<Endereco> listar();
}
