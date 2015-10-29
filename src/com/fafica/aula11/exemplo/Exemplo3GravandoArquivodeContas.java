package com.fafica.aula11.exemplo;

import java.util.ArrayList;

public class Exemplo3GravandoArquivodeContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		ArrayList<Conta> contasRecuperada;
		contas.add(new Conta("Maurício", 10.4));
		contas.add(new Conta("Mateus", 100.4));
		contas.add(new Conta("Joyce", 500.1));
		contas.add(new Conta("Aline", 1500.0));
		ManipularArquivo.gravarDados(contas);
		
		contasRecuperada = ManipularArquivo.recuperarDados();
		for(Conta c: contasRecuperada) {
			System.out.println(c.toString());
		}
	}

}
