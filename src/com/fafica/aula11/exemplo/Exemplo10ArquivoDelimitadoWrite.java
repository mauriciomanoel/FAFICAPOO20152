package com.fafica.aula11.exemplo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exemplo10ArquivoDelimitadoWrite {
	public static void main(String[] args) {
		Path path = Paths.get("C:/temp/aulapoo/exemplo10.txt");
		Charset utf8 = StandardCharsets.UTF_8; 
		try {
			BufferedWriter w = Files.newBufferedWriter(path, utf8);
			w.write("Minha;Casa;a;Lua\r\n");
			w.flush();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
