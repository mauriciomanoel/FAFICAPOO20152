/*
* RepositorioClienteArray.java
* Vers�o: 1.0
* Data de Cria��o : 12/02/2015
*
*/
package com.fafica.aula04.cliente;

import java.util.ArrayList;

public class RepositorioClienteArray 
	implements IRepositorioCliente {
    private Cliente[] clientes;
    private int indice;
    private int id;
    public static final int TAMANHO_DAFAULT = 100;
    
    public RepositorioClienteArray() {
        clientes = new Cliente[TAMANHO_DAFAULT];
        indice = 0;
        id = 1;
    }
    /**
     * Propositadamente com visibilidade default
     */
    RepositorioClienteArray(Cliente[] clientes, int indice) {
        this.clientes = clientes;
        this.indice = indice;
        id = 1;
    }
	/**
	* M�todo que cadastrar um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteJaCadastradoException  
	*/
    public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException {
    	// Verifica se o cliente existe no reposit�rio
    	if (this.existe(cliente.getCpf())) throw new ClienteJaCadastradoException();
		
    	cliente.setCodigo(this.id);
		clientes[this.indice] = cliente;
		this.indice = this.indice + 1;
		this.id = this.id + 1; 
    }
	/**
	* M�todo que remove um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteNaoEncontradoException 
	*/
    public void remover(String cpf) throws ClienteNaoEncontradoException {
        int i = getIndice(cpf);
        if (i == -1) throw new ClienteNaoEncontradoException();
        clientes[i] = clientes[indice-1];
        indice = indice - 1;
        clientes[indice] = null;
    }
	/**
	* M�todo que procura um objeto de classe Cliente no Reposit�rio
	*
	* @param CPF Cliente.
	* @return Cliente
	* @throws ClienteNaoEncontradoException 
	*/
    public Cliente procurar(String cpf) throws ClienteNaoEncontradoException {
    	Cliente cliente = null;
        int i = getIndice(cpf);
        if (i == -1) throw new ClienteNaoEncontradoException();
        
        return clientes[i];
        
    }
	/**
	* M�todo que atualiza um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return Cliente
	* @throws ClienteNaoEncontradoException 
	*/
    public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException {
        int i = getIndice(cliente.getCpf());
        if (i == -1) throw new ClienteNaoEncontradoException();
        clientes[i] = cliente;
    }
	/**
	* M�todo que verifica se um objeto de classe Cliente existe no Reposit�rio
	*
	* @param CPF Cliente.
	* @return Boolean
	* @throws  
	*/
    public boolean existe(String cpf) {
        boolean resposta;
            if (getIndice(cpf) >= 0) resposta = true;
            else resposta = false;
        return resposta;
    }
    
	/**
	* M�todo que lista objetos de classe Cliente no Reposit�rio
	*
	* @param 
	* @return ArrayList<Cliente>
	* @throws  
	*/
    public ArrayList<Cliente> listar() { 
    	ArrayList<Cliente> lista = new ArrayList<Cliente>();
    	for (int i = 0; i < indice; i = i + 1) {
            lista.add(clientes[i]);
        }
    	
    	return lista;
    }
    
	/**
	* M�todo que retorna um indice valido para o Reposit�rio
	*
	* @param CPF do Cliente
	* @return int
	* @throws  
	*/
    private int getIndice(String cpf) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (clientes[i].getCpf().equals(cpf)) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }
}