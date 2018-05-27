package br.com.calculadora.energia.model;

import br.com.calculadora.energia.excecoes.PessoaException;

public class Pessoa extends Locacao {
	/**
	 * Atributo que recebe o nome do �suario
	 */
	private String nome;
	/**
	 * Atributo que recebe o sobrenome do �suario
	 */
	private String sobrenome;
	/**
	 * Atributo que recebe o cpf do �suario
	 */
	private String cpf;

	/**
	 * Metodo contrutor
	 * @param nome
	 * @param sobrenome
	 * @param cpf
	 */
	public Pessoa(String nome, String sobrenome, String cpf) {
		/**
		 * Verifica se nome e sobrenome � nulo
		 */
		if (nome == null || sobrenome == null) {
			/**
			 * Se o nome for nulo, jogue a exce��o da classe PessoaException
			 */
			throw new PessoaException("Nome e sobrenome n�o podem ser nulos");
		} else {
			/**
			 * Sen�o receba o nome e sobrenome
			 */
			this.nome = nome;
			this.sobrenome = sobrenome;
		}
		/**
		 * Verifica se o tamanho do cpf � menor ou maior que 14
		 */
		if (cpf.length() < 14 || cpf.length() > 14) {
			/**
			 * Se for jogue a exce��o da classe PessoaException
			 */
			throw new PessoaException("CPF inv�lido");
		} else {
			this.cpf = cpf;
		}
	}

	/**
	 * Metodo que retorna o valor encapsulado de nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo que retorna o valor encapsulado de sobrenome
	 * @return
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Metodo que retorna o valor encapsulado de cpf
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

}
