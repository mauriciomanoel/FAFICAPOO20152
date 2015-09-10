package com.fafica.aula06.exemplo;
import java.util.Stack;
public class ColecaoPilhaString {
  public static void main(String[] args) {
	Stack<String> pilha;
	pilha = new Stack<String>();
	pilha.push("Aluno 1");
	pilha.push("Aluno 2");
	pilha.push("Aluno 3");
	pilha.push("Aluno 4");
	pilha.push("Aluno 5");
	pilha.push("Aluno 6");
	pilha.push("Aluno 7");
	System.out.println(pilha.pop());
	System.out.println(pilha);
  }
}
