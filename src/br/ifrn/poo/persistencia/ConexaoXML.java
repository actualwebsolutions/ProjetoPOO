package br.ifrn.poo.persistencia;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ConexaoXML {
	private String caminhoXML;
	private DocumentBuilderFactory dbf;
	private DocumentBuilder db;
	private Document doc;

	public ConexaoXML(String caminhoXML) throws Exception {
		this.caminhoXML = caminhoXML;	
		this.dbf = DocumentBuilderFactory.newInstance();
		this.db = dbf.newDocumentBuilder();
		this.doc = db.parse(this.caminhoXML);
	}
	
	public void getListaEnderecos() throws Exception{
		Element elem = doc.getDocumentElement();
		NodeList enderecos = elem.getElementsByTagName( "db:item_endereco" );
		
		for (int x = 0; x < enderecos.getLength(); x++) {
			Element tagEndereco = (Element) enderecos.item (x);
			
			int id = Integer.parseInt(tagEndereco.getAttribute("id"));
			String logradouro = getChildTagValue(tagEndereco, "db:logradouro");
			String bairro = getChildTagValue(tagEndereco, "db:bairro");
			String cidade = getChildTagValue(tagEndereco, "db:cidade");
			String uf = getChildTagValue(tagEndereco, "db:uf");
			String cep = getChildTagValue(tagEndereco, "db:cep");
			
			System.out.println("ID: " + id + " {\n\tLogradouro: " + logradouro + "\n\tBairro: " + bairro + "\n\tCidade: " + cidade + "\n\tUF: " + uf +  "\n\tCEP: " + cep + "\n}\n");			
		}
		
		System.out.println("Total de Endereços Cadastrados: " + enderecos.getLength());
		
	}
	
	/*  Este método lê e retorna o conteúdo (texto) de uma tag (elemento)
		filho da tag informada como parâmetro. A tag filho a ser pesquisada
		é a tag informada pelo nome (string) */
	private String getChildTagValue( Element elem, String tagName ) throws Exception {
		NodeList children = elem.getElementsByTagName( tagName );
		if( children == null ) return null;
    		Element child = (Element) children.item(0);
		if( child == null ) return null;
		
		return child.getFirstChild().getNodeValue();
	}
}
