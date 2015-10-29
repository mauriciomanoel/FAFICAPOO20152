package com.fafica.aula11.exemplo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exemplo10ArquivoDelimitadoReader {
	public static void main(String[] args) {
		Path path = Paths.get("C:/temp/aulapoo/exemplo10.txt");
		Charset utf8 = StandardCharsets.UTF_8; 
		String linha;
		String[] nomes;
		try {
			BufferedReader r = Files.newBufferedReader(path, utf8);
			while((linha = r.readLine()) != null) {
				System.out.println(linha);
				nomes = linha.split(";");
				System.out.println(nomes[0]);
				System.out.println(nomes[1]);
				System.out.println(nomes[2]);
				System.out.println(nomes[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
