package com.fafica.aula11.exemplo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class Exemplo7SerializacaoGravandoContaT {
	public static void main(String[] args) {
		try {
			OutputStream s;
			FileOutputStream fos;
			fos = new FileOutputStream("c:/temp/aulapoo/exemplo9.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ContaT c1 = new ContaT("Maurício", 1265.8, "123");
			c1.setNumeroCliente(2);
			ContaT c2 = new ContaT("Patricia", 2265.8, "321");
			System.out.println(c2.getNumeroCliente());
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
			oos.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
