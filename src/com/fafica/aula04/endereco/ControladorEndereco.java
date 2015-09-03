package com.fafica.aula04.endereco;
import java.util.ArrayList;

import com.fafica.aula02.util.ValidarCPF;
import com.fafica.aula04.cliente.CPFInvalidoException;
import com.fafica.aula04.util.CampoObritarorioInvalidoException;

public class ControladorEndereco {
	private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco() {
		this.repositorioEndereco = new RepositorioEnderecoArray();
	}
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException, 
													CampoObritarorioInvalidoException  {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inválido.");
	    if (endereco.getLogradouro().equals("")) throw new CampoObritarorioInvalidoException("Logradouro");
	    
	    this.repositorioEndereco.cadastrar(endereco);
	}
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException, 
													CampoObritarorioInvalidoException {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inválido.");
	    if (endereco.getLogradouro().equals("")) throw new CampoObritarorioInvalidoException("Logradouro");
		this.repositorioEndereco.atualizar(endereco);
	}
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.remover(id);
	}
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurar(id);
	}
	public Endereco procurarPorCliente(Integer clienteId) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarPorCliente(clienteId);
	}
	public ArrayList<Endereco> listar() {
		return this.repositorioEndereco.listar();
	}
}

