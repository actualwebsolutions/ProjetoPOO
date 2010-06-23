package br.ifrn.poo.persistencia;

public class TesteXML {
	public static void main(String[] args) throws Exception {
		String caminhoXML = "D:\\ifrn - tads\\poo\\projeto\\SisBancario\\BancoDeDados.xml";
		ConexaoXML xml = new ConexaoXML(caminhoXML);
		
		System.out.println("Listagem de Endereços:\n");
		xml.getListaEnderecos();
	}
}
