package br.com.calculadora.energia.executavel;

import br.com.calculadora.energia.model.Locacao;
import br.com.calculadora.energia.model.Pessoa;

public class Executavel {
	public static void main(String[] args) {
		Locacao l = new Pessoa("Jo�o","Le�o","2323213");
		l.setEstado("ba");
		l.setRegiaoBrasil(l.getEstado());
		
		System.out.println(l.getRegiaoBrasil());
		
	}
}
