package com.fafica.aula11.exemplo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Exemplo5OutputStream {
	public static void main(String[] args) {
		String[] nomes = {"Maurício", "Manoel", "Mateus", "Coelho"};
		// Gravando um Objeto no Arquivo
		try {
			FileOutputStream fos;
			fos = new FileOutputStream("c:/temp/aulapoo/nomes.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(nomes);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
