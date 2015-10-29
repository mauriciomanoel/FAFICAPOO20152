package com.fafica.aula11.exemplo;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class Exemplo6SerializacaoLendoContaColecaoS {
	public static void main(String[] args)  {
		FileInputStream fis;
		ArrayList<ContaS> contas = new ArrayList<ContaS>();
		try {
			// Inicializando variável do tipo FileInputStream
			fis = new FileInputStream("c:/temp/aulapoo/exemplo6.txt");
			//Inicializando variável do tipo ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Carregando o primeiro elemento do arquivo
			ContaS c = (ContaS) ois.readObject();
			try {
				// loop infinito
				while(true) {
					contas.add(c);
					c = (ContaS) ois.readObject();
				}
			} catch(EOFException e){}
			for(ContaS c2: contas) {
				System.out.println(c2.toString());
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
