package br.ifrn.poo.tads.dominio;

public class ContaPoupanca extends Conta {
	private int valorTR;
	
	public ContaPoupanca(String numeroConta, Pessoa titular, String saldo, int valorTR) {
		super(numeroConta, titular, saldo);
		this.valorTR = valorTR;
	}
	
	public int getValorTR() {
		return valorTR;
	}

	public void setValorTR(int valorTR) {
		this.valorTR = valorTR;
	}
	
}
