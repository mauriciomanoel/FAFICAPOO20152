package com.fafica.aula04.endereco;

public class EnderecoNaoEncontradoException extends Exception {
    public EnderecoNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
