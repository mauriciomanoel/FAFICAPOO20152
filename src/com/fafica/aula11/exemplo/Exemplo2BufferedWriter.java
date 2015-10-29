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
public class Exemplo2BufferedWriter {
	public static void main(String[] args) throws IOException {
		String linha = null;
		// Inicializando o path
		Path path = Paths.get("c:/temp/aulapoo/exemplo2.txt");
		// Declarando variável do tipo charset (Codificação de Caracteres)
		Charset utf8 = StandardCharsets.ISO_8859_1; 
		// Criando variável do tipo BufferedWriter
		BufferedWriter w = null;
		try {
			// Inicializando Variável
			w = Files.newBufferedWriter(path, utf8);
			// Gravando Variável
			w.write("Mauricio\r\n");
			w.write("Manoel\r\n");
			w.write("Coelho\r\n");
			// Libera os dados da memoria e grava no arquivo
			w.flush();
			w.close();// Fecha o Arquivo
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (w != null) {
				w.close();
			}
		}
	}
}
