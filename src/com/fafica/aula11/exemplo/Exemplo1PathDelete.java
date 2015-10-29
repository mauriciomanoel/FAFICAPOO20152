package com.fafica.aula11.exemplo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exemplo1PathDelete {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/aulapoo/mauricio.txt");
		// Deleta e pode levantar exce��es.
		Files.delete(path);
		// N�o sem lan�ar exce��o
		Files.deleteIfExists(path); 
	}
}