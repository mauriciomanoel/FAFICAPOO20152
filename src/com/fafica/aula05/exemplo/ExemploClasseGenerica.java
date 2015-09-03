package com.fafica.aula05.exemplo;
// Classe com atributo definido como genérico.
public class ExemploClasseGenerica {

	public static void main(String[] args) {
		ClasseGenerica<String> objStr = new ClasseGenerica<String>("String objeto generico");
        ClasseGenerica<Integer> objInt = new ClasseGenerica<Integer>(100);
        ClasseGenerica<Boolean> objBoolean = new ClasseGenerica<Boolean>(true);
        
        //Objetos Criados
        System.out.println("Criado como String : "+objStr.getAtributo());
        System.out.println("Criado como Integer : "+objInt.getAtributo());
        System.out.println("Criado como Boolean : "+objBoolean.getAtributo());
        
        objStr.setAtributo("Modificando Atributo do Objeto generico");
        objInt.setAtributo(25);
        objBoolean.setAtributo(false);
        
        System.out.println("");
        //Objetos Criados
        System.out.println("Criado como String : "+objStr.getAtributo());
        System.out.println("Criado como Integer : "+objInt.getAtributo());
        System.out.println("Criado como Boolean : "+objBoolean.getAtributo());
	}

}
