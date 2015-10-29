package com.fafica.aula11.exemplo;
import java.io.File;
public class Exemplo4TrabalhandoDiretorio {
	public static void main(String[] args) {
		File diretorio = new File("src/");
		 System.out.println("Nome do arquivo: " + diretorio.getName());
		 System.out.println("� um diret�rio? " + diretorio.isDirectory());
		 System.out.println("Caminho: " + diretorio.getAbsolutePath());
		 System.out.println("Conte�do do diret�rio:");
		 String[] conteudo = diretorio.list();
		 for (int i = 0; i < conteudo.length; i++) {
		 	System.out.println("\t" + i + " - " + conteudo[i]);
		 }
	}
}
