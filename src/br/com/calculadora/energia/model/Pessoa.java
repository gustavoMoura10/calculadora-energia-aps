package br.com.calculadora.energia.model;

import br.com.calculadora.energia.excecoes.PessoaException;

public class Pessoa extends Locacao {
	private String nome;
	private String sobrenome;
	private String cpf;

	public Pessoa(String nome, String sobrenome, String cpf) {
		if (nome == null || sobrenome == null) {
			throw new PessoaException("Nome e sobrenome não podem ser nulos");
		} else {
			this.nome = nome;
			this.sobrenome = sobrenome;
		}
		if (cpf.length() < 14 || cpf.length() > 14) {
			throw new PessoaException("CPF inválido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

}
