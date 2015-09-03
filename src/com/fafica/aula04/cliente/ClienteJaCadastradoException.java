package com.fafica.aula04.cliente;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
    
    public ClienteJaCadastradoException(String msg){
        super ("Cliente " + msg + " já cadastrado!");
    }
} 