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
import java.util.ArrayList;

public class ManipularArquivo {
	
	public static void gravarDados(ArrayList<Conta> contas) {
		// Criando o path do arquivo
		Path path = Paths.get("c:/temp/aulapoo/contas.txt");
		// Definindo codificação para UTF8
		Charset utf8 = StandardCharsets.UTF_8;
		try {
			BufferedWriter w = Files.newBufferedWriter(path, utf8, StandardOpenOption.APPEND);
			for(Conta c: contas) {
				w.write(c.getNome() +  ";" + c.getSaldo() + "\r\n");
			}
			w.flush();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Conta> recuperarDados() {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		String linha = null;
		String[] nomes;
		Path path = Paths.get("c:/temp/aulapoo/contas.txt");
		// Definindo codificação para UTF8
		Charset utf8 = StandardCharsets.UTF_8;
		try {
			BufferedReader r = Files.newBufferedReader(path, utf8);
			while((linha = r.readLine()) != null) {
				nomes = linha.split(";");
				contas.add(new Conta(nomes[0], Double.parseDouble(nomes[1])));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contas;
	}
}
