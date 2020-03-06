package br.com.logic.financeiro;


/*Deverá ser solicitado ao usuario final os dados [número da conta, tipo da conta (conta corrente,conta poupança), cpf, nome, idade ].
	Deverá armazenado em memoria as informações.
	Deverá existir validações de cadastro:

		Não é permitido a criação de 2 contas de um mesmo tipo por CPF;
		Não é permitido a criação de 2 contas com o mesmo número de conta;*/
public class CadastroConta {

  private String numeroConta;
  private String TipoConta;
  private String cpf;
  private String nome;
  private int idade;

  public CadastroConta() {
  }

  public void cadastrarConta() {

  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public CadastroConta setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }

  public String getTipoConta() {
    return TipoConta;
  }

  public CadastroConta setTipoConta(String tipoConta) {
    TipoConta = tipoConta;
    return this;
  }

  public String getCpf() {
    return cpf;
  }

  public CadastroConta setCpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  public String getNome() {
    return nome;
  }

  public CadastroConta setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public int getIdade() {
    return idade;
  }

  public CadastroConta setIdade(int idade) {
    this.idade = idade;
    return this;
  }

  @Override
  public String toString() {
    return "ContaCadastro{" +
        "numeroConta='" + numeroConta + '\'' +
        ", TipoConta='" + TipoConta + '\'' +
        ", cpf='" + cpf + '\'' +
        ", nome='" + nome + '\'' +
        ", idade=" + idade +
        '}';
  }
}
