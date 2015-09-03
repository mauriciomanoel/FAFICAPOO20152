package com.fafica.aula05.exemplo;

import java.util.ArrayList;

public interface IRepositorioDAO <Pk, T> {
	public void cadastrar(T objeto);
	public T procurar(Pk valor) ;
	public void atualizar(T objeto) ;
	public void remover(Pk valor) ;
	public boolean existe(Pk valor);
	public ArrayList<T> listar();

}
