package com.fafica.aula05.exemplo;

import java.util.ArrayList;

import com.fafica.aula04.cliente.Cliente;

public class RepositorioClienteBDR implements IRepositorioDAO<String, Cliente>{
	@Override
	public void cadastrar(Cliente objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente procurar(String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Cliente objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existe(String valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
