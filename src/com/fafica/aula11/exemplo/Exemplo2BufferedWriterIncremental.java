package com.fafica.aula11.exemplo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Exemplo2BufferedWriterIncremental {
	public static void main(String[] args) {
		String linha = null;
		// Inicializando o path
		Path path = Paths.get("c:/temp/aulapoo/exemplo2.txt");
		// Declarando variável do tipo charset (Codificação de Caracteres)
		Charset utf8 = StandardCharsets.UTF_8; 
		// Criando variável do tipo BufferedWriter (Repositório de Dados)
		BufferedWriter w;
		try {
			// Inicializando Variável
			w = Files.newBufferedWriter(path, utf8, StandardOpenOption.APPEND);
			// Gravando Variável
			w.write("Júnior\r\n");
			// Libera os dados da memoria e grava no arquivo
			w.flush();
			// Fecha o Arquivo
			w.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
