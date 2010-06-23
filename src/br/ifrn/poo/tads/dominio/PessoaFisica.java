package br.ifrn.poo.tads.dominio;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String identidade;

	public PessoaFisica(String nome, Endereco endereco, String cpf,
			String identidade) {
		super(nome, endereco);
		this.cpf = cpf;
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
}
