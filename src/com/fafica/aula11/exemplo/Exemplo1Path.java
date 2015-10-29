package com.fafica.aula11.exemplo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exemplo1Path {
	public static void main(String[] args) throws IOException {
		String texto, textoRetorno;
		byte[] bytes, retorno;
		// Definindo o path inical
		Path path = Paths.get("c:/temp/aulapoo/mauricio.txt");
		// Imprimindo o caminho absoluto
		System.out.println(path.toAbsolutePath());
		// Imprimindo a pasta onde o arquivo esta
		System.out.println(path.getParent());
		// Criando a pasta
		Files.createDirectories(path.getParent());
		// Imprimindo a pasta raiz do arquivo
		System.out.println(path.getRoot());
		// Pega o nome do arquivo
		System.out.println(path.getFileName());
		// Inicializando a Variável String
		texto = "Mauricio Manoel";
		// Pegando os bytes do texto
		bytes = texto.getBytes();
		// Gravando no arquivo definido no path
		Files.write(path, bytes);
		// Lendo as informações do arquivo definido no path
		retorno = Files.readAllBytes(path);
		// Convertendo o array de bytes em String
		textoRetorno = new String(retorno);
		// Imprimindo o conteudo do arquivo
		System.out.println(textoRetorno);
	}
}
