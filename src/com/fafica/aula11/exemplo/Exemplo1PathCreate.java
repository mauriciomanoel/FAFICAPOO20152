package com.fafica.aula11.exemplo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class Exemplo1PathCreate {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/aulapoo/mauricio.txt");
		//Files.createFile(path);
		Files.write(path, "ET, Telefone, Minha Casa".getBytes());
		// Copiando
		Path copia = Paths.get("c:/temp/aulapoo/mauricio-copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		// Movendo
		Path mover = Paths.get("c:/temp/aulapoo-novo/mauricio-copia.txt");
		Files.createDirectories(mover.getParent());
		Files.move(copia, mover);
	}
}