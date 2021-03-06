package com.fafica.aula05.exemplo;
// Objetivo: Fazer uso de um método genérico sem limitar tipos
public class ExemploGenericaLimitacao1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Maurício Manoel",500.0,5);
        System.out.println("Gratificação do funcionario "+funcionario1.getNome()+ " :"+descobreGratificacao(funcionario1));
        Funcionario funcionario2 = new Funcionario("Maria",500.0,11);
        System.out.println("Gratificação do funcionario "+funcionario2.getNome()+ " :"+descobreGratificacao(funcionario2));
        Gerente funcionario3 = new Gerente("Mateus",1500.0,11, 5);
        System.out.println("Gratificação do funcionario "+funcionario3.getNome()+ " :"+descobreGratificacao(funcionario3));
	}
	
	public static <T extends Funcionario> Double descobreGratificacao(T funcionario){
        Double aumento = 0.0;
        if(funcionario.getTempoEmpresa()< 10)
            aumento = funcionario.getSalario()*1.1;
        else
            aumento = funcionario.getSalario()*1.3;
        return aumento;
   }

}
