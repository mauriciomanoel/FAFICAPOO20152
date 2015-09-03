package com.fafica.aula04.cliente;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super ("Cliente j� cadastrado!");
    }
    
    public ClienteJaCadastradoException(String msg){
        super ("Cliente " + msg + " j� cadastrado!");
    }
} 