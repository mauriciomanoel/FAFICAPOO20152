package com.fafica.aula04.endereco;

public class EnderecoJaCadastradoException extends Exception {
    public EnderecoJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 