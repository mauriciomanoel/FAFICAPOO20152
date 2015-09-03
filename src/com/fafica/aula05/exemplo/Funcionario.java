package com.fafica.aula05.exemplo;

public class Funcionario {
     private String nome;
     private Double salario;
     private Integer tempoEmpresa;

     public Funcionario(String nome, Double salario, Integer tempoEmpresa){
          this.nome = nome;
          this.salario = salario;
          this.tempoEmpresa = tempoEmpresa;
     }

     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public Double getSalario() {
          return salario;
     }
     public void setSalario(Double salario) {
          this.salario = salario;
     }
     public Integer getTempoEmpresa() {
          return tempoEmpresa;
     }
     public void setTempoEmpresa(Integer tempoEmpresa) {
          this.tempoEmpresa = tempoEmpresa;
     }
}
