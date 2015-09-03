package com.fafica.aula02.cliente;

import java.util.ArrayList;

public class RepositorioClienteArray implements IRepositorioCliente {

	@Override
	public void cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Estou no RepositorioClienteArray :D :D :D");
		cliente.setCodigo(10);
		
	}

	@Override
	public void atualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remover(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente procurar(String cpf) {
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
		return null;
	}

}
