package com.fafica.aula11.exemplo;
import java.io.File;
import java.util.Date;
public class Exemplo4TrabalhandoArquivo {
	public static void main(String[] args) {
		Date data;
		File arquivo = null;
		arquivo = new File("arquivos"+ arquivo.separator +  "arquivo1.txt");
		System.out.println("Separador: " + arquivo.separator);
		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("O arquivo existe? " + arquivo.exists());
		System.out.println("É um diretório? " + arquivo.isDirectory());
		System.out.println("Ultima Modificação " 
		+ new Date(arquivo.lastModified()).toString());
		System.out.println("Path Completo " + arquivo.getAbsolutePath());
		System.out.println(arquivo.lastModified());
		System.out.println("Posso ler? " + arquivo.canRead());
		System.out.println("Posso escrever? " + arquivo.canWrite());
	}
}
