package br.ifrn.poo.tads.dominio;
public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String UF;
	private String CEP;
	
	public Endereco(String logradouro, String bairro, String cidade, String UF, String CEP) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
		this.CEP = CEP;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String toString() {
		return logradouro + " " + bairro + " " + cidade + "/" + UF;
	}	
}
