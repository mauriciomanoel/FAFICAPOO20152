package com.fafica.aula11.exemplo;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class Exemplo6SerializacaoLendoContaS {
	public static void main(String[] args)  {
		FileInputStream fis;
		try {
			// Inicializando variável do tipo FileInputStream
			fis = new FileInputStream("c:/temp/aulapoo/exemplo6.txt");
			//Inicializando variável do tipo ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Carregando o primeiro elemento do arquivo
			ContaS c1 = (ContaS) ois.readObject();
			ContaS c2 = (ContaS) ois.readObject();
			System.out.println(c1.toString());
			System.out.println(c2.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
