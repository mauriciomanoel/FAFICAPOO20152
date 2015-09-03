package com.fafica.aula04.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
    public ClienteNaoEncontradoException(String msg){
        super ("Cliente " + msg + " não encontrado!");
    }
}
