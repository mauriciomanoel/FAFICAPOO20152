package com.fafica.aula04.exemplo;
public class LevantandoExcecao3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ClienteJaCadastradoException();
		} catch (ClienteJaCadastradoException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
