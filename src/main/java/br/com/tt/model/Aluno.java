package br.com.tt.model;

public class Aluno {
  private String nome;
  private String cpf;

  /**
   * @Classe aluno modelo
   */

  public Aluno() {
    super();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(final String cpf) {
    this.cpf = cpf;
  }

  public void salvar() {

  }

}
