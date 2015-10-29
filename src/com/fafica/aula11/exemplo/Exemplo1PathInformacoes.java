package com.fafica.aula11.exemplo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exemplo1PathInformacoes {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/aulapoo/mauricio.txt");
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.size(path));
	}
}
