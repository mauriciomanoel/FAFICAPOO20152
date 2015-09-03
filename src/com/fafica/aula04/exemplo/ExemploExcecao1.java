package com.fafica.aula04.exemplo;
public class ExemploExcecao1 {
	public static void main(String[] args)  {
		try {
			throw new 
			ClienteNaoEncontradoException("Cliente não encontrado");
		} catch (ClienteNaoEncontradoException e) {
			//e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
	}
}
