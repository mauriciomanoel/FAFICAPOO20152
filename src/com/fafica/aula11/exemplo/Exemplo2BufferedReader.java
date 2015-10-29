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
public class Exemplo2BufferedReader {
	public static void main(String[] args) throws IOException {
		String linha = null;
		// Inicializando o path
		Path path = Paths.get("c:/temp/aulapoo/exemplo2.txt");
		// Declarando variável do tipo charset 
		// (Codificação de Caracteres)
		Charset utf8 = StandardCharsets.UTF_8; 
		BufferedReader r = null;
		try {
			// Inicializando a variável para leitura 
			// do arquivo com o mesmo charset
			r = Files.newBufferedReader(path, utf8);
			// Enquanto não chegar no fim do arquivo, imprima
			while ((linha = r.readLine()) != null) {
				System.out.println(linha);
			}
			r.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (r != null) {
				r.close();
			}
		}
	}
}
