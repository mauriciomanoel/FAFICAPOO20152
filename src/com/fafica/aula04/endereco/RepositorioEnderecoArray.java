/*
* RepositorioClienteArray.java
* Vers�o: 1.0
* Data de Cria��o : 12/02/2015
*
*/
package com.fafica.aula04.endereco;

import java.util.ArrayList;

public class RepositorioEnderecoArray 
	implements IRepositorioEndereco {
    private Endereco[] enderecos;
    private int indice;
    private int id;
    public static final int TAMANHO_DAFAULT = 100;
    
    public RepositorioEnderecoArray() {
    	enderecos = new Endereco[TAMANHO_DAFAULT];
        indice = 0;
        id = 1;
    }
    /**
     * Propositadamente com visibilidade default
     */
    RepositorioEnderecoArray(Endereco[] enderecos, int indice) {
        this.enderecos = enderecos;
        this.indice = indice;
        id = 1;
    }
	/**
	* M�todo que cadastrar um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws EnderecoJaCadastradoException  
	*/
    public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException {
    	// Verifica se o cliente existe no reposit�rio
    	if (this.existe(endereco.getId())) throw new EnderecoJaCadastradoException();
    	endereco.setId(this.id);
    	enderecos[this.indice] = endereco;
		this.indice = this.indice + 1;
		this.id = this.id + 1; 
    }
	/**
	* M�todo que remove um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws EnderecoNaoEncontradoException 
	*/
    public void remover(Integer id) throws EnderecoNaoEncontradoException {
        int i = getIndice(id);
        if (i == -1) throw new EnderecoNaoEncontradoException();
        enderecos[i] = enderecos[indice-1];
        indice = indice - 1;
        enderecos[indice] = null;
    }
	/**
	* M�todo que procura um objeto de classe Cliente no Reposit�rio
	*
	* @param CPF Cliente.
	* @return Cliente
	* @throws EnderecoNaoEncontradoException 
	*/
    public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException {
    	Endereco endereco = null;
        int i = getIndice(id);
        if (i == -1) throw new EnderecoNaoEncontradoException();
        
        return enderecos[i];
        
    }
	/**
	* M�todo que atualiza um objeto de classe Cliente no Reposit�rio
	*
	* @param Objeto da Classe Cliente.
	* @return Cliente
	* @throws EnderecoNaoEncontradoException 
	*/
    public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException {
        int i = getIndice(endereco.getId());
        if (i == -1) throw new EnderecoNaoEncontradoException();
        enderecos[i] = endereco;
    }
	/**
	* M�todo que verifica se um objeto de classe Cliente existe no Reposit�rio
	*
	* @param CPF Cliente.
	* @return Boolean
	* @throws  
	*/
    public boolean existe(Integer id) {
        boolean resposta;
            if (getIndice(id) >= 0) resposta = true;
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
    public ArrayList<Endereco> listar() { 
    	ArrayList<Endereco> lista = new ArrayList<Endereco>();
    	for (int i = 0; i < indice; i = i + 1) {
            lista.add(enderecos[i]);
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
    private int getIndice(Integer id) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (enderecos[i].getId().equals(id)) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }
    
	public Endereco procurarPorCliente(Integer clienteId)
			throws EnderecoNaoEncontradoException {
		boolean achou = false;
		Endereco endereco = null;
        
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (enderecos[i].getCliente().getCodigo().equals(clienteId)) {
                endereco = enderecos[i];
                achou = true; 
                break;
            }
        }
        return endereco;
	}
}