package br.ifrn.poo.tads.dominio;

public class PessoaFisica extends Pessoa {
	String cpf;
	String identidade;
	
	public PessoaFisica(String nome, Endereco endereco, String cpf, String identidade) {
		super(nome, endereco);
		this.cpf = cpf;
		this.identidade = identidade;
	}
}
