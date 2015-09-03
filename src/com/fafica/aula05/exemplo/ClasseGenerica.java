package com.fafica.aula05.exemplo;
// Classe com atributo definido como gen�rico.
public class ClasseGenerica <T> {
	 private T atributo;
	 
	 public ClasseGenerica (T atributo) {
		 this.atributo = atributo;
	 }
     public T getAtributo() {
    	 return this.atributo;
     }
     
     public void setAtributo(T atributo) {
         this.atributo = atributo;
     }
}
