package com.fafica.aula04.exemplo;
public class Bina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Conta conta = new Conta("123", 100);
			conta.debitar("123", 190);
			String nome = null;
			System.out.println("Pega o R$ Mano :D ");
			//System.out.println(nome.charAt(0));
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Sistema indiponivel no momento, por favor tente mais tarde :D :D :D he he he");
			e.printStackTrace();
		} finally {
			System.out.println("Let's Go !!!");
		}
		

	}

}
