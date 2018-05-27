package br.com.calculadora.energia.excecoes;

public class PessoaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Metodo contrutor que passa para a mãe uma exceção
	 * @param excecao
	 */
	public PessoaException(String s) {
		super(s);
	}

}
