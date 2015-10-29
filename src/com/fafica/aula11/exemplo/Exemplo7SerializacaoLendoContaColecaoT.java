package com.fafica.aula11.exemplo;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class Exemplo7SerializacaoLendoContaColecaoT {
	public static void main(String[] args)  {
		FileInputStream fis;
		ArrayList<ContaT> contas = new ArrayList<ContaT>();
		try {
			// Inicializando variável do tipo FileInputStream
			fis = new FileInputStream("c:/temp/aulapoo/exemplo9.txt");
			//Inicializando variável do tipo ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Carregando o primeiro elemento do arquivo
			ContaT c = (ContaT) ois.readObject();
			try {
				// loop infinito
				while(true) {
					contas.add(c);
					c = (ContaT) ois.readObject();
				}
			} catch(EOFException e){}
			// Lendo os objetos
			for(ContaT c2: contas) {
				System.out.println(c2.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
