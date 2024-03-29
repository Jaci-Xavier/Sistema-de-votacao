package com.betrybe.sistemadevotacao;

/**
 * Classe que representa uma pessoa eleitora.
 */

public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor da classe PessoaEleitora.
   */

  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  /**
   * Metodos Getter e Setter.
   */

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
