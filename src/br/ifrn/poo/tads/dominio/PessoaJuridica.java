package br.ifrn.poo.tads.dominio;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;

	public PessoaJuridica(String nome, Endereco endereco, String cnpj,
			String nomeFantasia, String razaoSocial) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
