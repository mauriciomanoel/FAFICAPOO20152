package com.fafica.aula04.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente n�o encontrado!");
    }
    public ClienteNaoEncontradoException(String msg){
        super ("Cliente " + msg + " n�o encontrado!");
    }
}
