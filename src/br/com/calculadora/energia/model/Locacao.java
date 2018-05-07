package br.com.calculadora.energia.model;

import br.com.calculadora.energia.excecoes.FederacaoException;

public abstract class Locacao {
	private String nome;
	private String federacao;
	public Locacao(String nome, String federacao) throws FederacaoException {
		this.nome = nome;
		if(federacao.length()<2 || federacao.length()>2) {
			throw new FederacaoException("Federação deve ter 2 digitos");
		}
		this.federacao = federacao;
	}
	public String getNome() {
		return nome;
	}
	public String getFederacao() {
		return federacao.toUpperCase();
	}
	
	
}
