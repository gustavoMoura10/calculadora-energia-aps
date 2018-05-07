package br.com.calculadora.energia.model;

public class Pessoa extends Locacao{
	private String nome;
	private String sobrenome;
	private String cpf;

	public Pessoa(String nome, String federacao) {
		super(nome, federacao);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
