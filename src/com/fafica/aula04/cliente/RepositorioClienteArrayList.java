package com.fafica.aula04.cliente;

import java.util.ArrayList;

public class RepositorioClienteArrayList implements IRepositorioCliente {
	private ArrayList<Cliente> clientes;
	private int id;
	
	public RepositorioClienteArrayList() {
		clientes = new ArrayList<Cliente>();
		id = 1;
	}
	@Override
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException {
		cliente.setCodigo(id);
		clientes.add(cliente);
		id++;
		
	}

	@Override
	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return clientes;
	}

}
