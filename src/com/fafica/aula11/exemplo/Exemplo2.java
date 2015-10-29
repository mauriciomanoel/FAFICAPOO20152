package com.fafica.aula11.exemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo2 {

	public static void main(String[] args) {
		String arquivo = "c:" + File.separator + "temp" + File.separator + "aulapoo" + File.separator + "mauricio.txt";
		Path path = Paths.get(arquivo);
		
		//Charset utf8 = StandardCharsets.UTF_8;
		try {
			BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
