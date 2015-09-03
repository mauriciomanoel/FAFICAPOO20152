/*
* TelaCadastroCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package com.fafica.aula04.main;

import com.fafica.aula04.fachada.Fachada;
import com.fafica.aula04.util.CampoObritarorioInvalidoException;
import java.util.ArrayList;
import com.fafica.aula04.cliente.CPFInvalidoException;
import com.fafica.aula04.cliente.Cliente;
import com.fafica.aula04.cliente.ClienteJaCadastradoException;
import com.fafica.aula04.cliente.ClienteNaoEncontradoException;
import com.fafica.aula04.cliente.IdadeInvalidoException;
import com.fafica.aula04.endereco.Endereco;
import com.fafica.aula04.endereco.EnderecoJaCadastradoException;
import com.fafica.aula04.endereco.EnderecoNaoEncontradoException;

public class TelaCliente2 {
	// 754.621.443-26 
	// 345.135.354-74
	// 171.093.227-93	
	public static void main(String[] args) throws IllegalArgumentException, CPFInvalidoException, ClienteJaCadastradoException, CampoObritarorioInvalidoException, IdadeInvalidoException, EnderecoJaCadastradoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException  {
		Fachada fachada = Fachada.getInstance();
		Cliente cliente = new Cliente("Mauricio", "754.621.443-26", "Bradesco");
		Endereco endereco = new Endereco(cliente, "logradouro", "numero", "bairro", "cidade", "PE");
		cliente.setEndereco(endereco);
		fachada.cadastrarCliente(cliente);
		
		Cliente cliente2 = new Cliente("Mauricio2", "345.135.354-74", "Bradesco");
		Endereco endereco2 = new Endereco(cliente2, "logradouro2", "numero", "bairro", "cidade", "PE");
		cliente2.setEndereco(endereco2);
		fachada.cadastrarCliente(cliente2);
		
		Cliente cliente3 = new Cliente("Mauricio3", "171.093.227-93", "Bradesco");
		Endereco endereco3 = new Endereco(cliente3, "logradouro3", "numero", "bairro", "cidade", "PE");
		cliente3.setEndereco(endereco3);
		fachada.cadastrarCliente(cliente3);
		
		ArrayList<Cliente> clientes = fachada.listarCliente();
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		
		fachada.removerCliente("345.135.354-74");
		System.out.println("Após a Remoção");
		clientes = fachada.listarCliente();
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		
		Cliente cliente4 = new Cliente("Mauricio4", "345.135.354-74", "Bradesco");
		Endereco endereco4 = new Endereco(cliente4, "logradouro4", "numero", "bairro", "cidade", "PE");
		cliente4.setEndereco(endereco4);
		fachada.cadastrarCliente(cliente4);
		
		System.out.println("Após Adicionar");
		clientes = fachada.listarCliente();
		for(Cliente c: clientes) {
			System.out.println(c);
		}
	}
}
