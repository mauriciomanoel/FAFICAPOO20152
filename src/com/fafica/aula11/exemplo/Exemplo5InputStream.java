package com.fafica.aula11.exemplo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Exemplo5InputStream {
	public static void main(String[] args) {
		String[] nomesRecuperado;
		// Recuperando o objeto do arquivo
		FileInputStream fis;
		try {
			fis = new FileInputStream("c:/temp/aulapoo/nomes.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			nomesRecuperado = (String[]) ois.readObject();
			System.out.println(nomesRecuperado[0]);
			System.out.println(nomesRecuperado[1]);
			System.out.println(nomesRecuperado[2]);
			System.out.println(nomesRecuperado[3]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
