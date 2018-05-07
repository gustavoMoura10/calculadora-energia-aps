package br.com.calculadora.energia.excecoes;

public class FederacaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public FederacaoException(String excecao) {
		super(excecao);
	}

}
