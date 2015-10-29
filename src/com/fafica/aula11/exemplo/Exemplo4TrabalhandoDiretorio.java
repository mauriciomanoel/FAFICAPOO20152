package com.fafica.aula11.exemplo;
import java.io.File;
public class Exemplo4TrabalhandoDiretorio {
	public static void main(String[] args) {
		File diretorio = new File("src/");
		 System.out.println("Nome do arquivo: " + diretorio.getName());
		 System.out.println("É um diretório? " + diretorio.isDirectory());
		 System.out.println("Caminho: " + diretorio.getAbsolutePath());
		 System.out.println("Conteúdo do diretório:");
		 String[] conteudo = diretorio.list();
		 for (int i = 0; i < conteudo.length; i++) {
		 	System.out.println("\t" + i + " - " + conteudo[i]);
		 }
	}
}
