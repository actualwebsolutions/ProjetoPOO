package br.ifrn.poo.tads.dominio;

public class PessoaJuridica extends Pessoa {
	String cnpj;
	String nomeFantasia;
	String razaoSocial;
	
	public PessoaJuridica(String nome, Endereco endereco, String cnpj, String nomeFantasia, String razaoSocial) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
	}
}
