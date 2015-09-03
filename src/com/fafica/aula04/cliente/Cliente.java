package com.fafica.aula04.cliente;
import com.fafica.aula04.endereco.Endereco;

public class Cliente {
	private Integer codigo;
    private String nome;
    private String cpf;
    private String banco;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String banco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setBanco(banco);
    }

    public Cliente(Integer codigo, String nome, String cpf, String banco) {
    	this.setCodigo(codigo);
    	this.setNome(nome);
        this.setCpf(cpf);
        this.setBanco(banco);
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getCpfFormatado() {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }
    
    private void setCpf(String cpf) {
    	this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + this.getCpfFormatado() + ", banco=" + banco + ", endereco="
				+ endereco + "]";
	}
}
