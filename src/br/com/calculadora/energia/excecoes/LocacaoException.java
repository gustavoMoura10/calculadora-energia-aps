package br.com.calculadora.energia.excecoes;

public class LocacaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Metodo contrutor que passa para a m�e uma exce��o
	 * @param excecao
	 */
	public LocacaoException(String excecao) {
		super(excecao);
	}

}
