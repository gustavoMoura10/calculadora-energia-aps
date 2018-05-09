package br.com.calculadora.energia.excecoes;

public class LocacaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public LocacaoException(String excecao) {
		super(excecao);
	}

}
