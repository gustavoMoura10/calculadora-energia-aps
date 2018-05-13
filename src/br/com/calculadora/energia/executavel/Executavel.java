package br.com.calculadora.energia.executavel;

import java.util.Scanner;

import br.com.calculadora.energia.model.Locacao;
import br.com.calculadora.energia.model.Pessoa;
import br.com.calculadora.energia.model.Solar;

public class Executavel {
	public static void main(String[] args) {
		banner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual � seu nome?");
		String nome = scanner.nextLine();
		System.out.println("Qual � seu sobrenome?");
		String sobrenome = scanner.nextLine();
		System.out.println("Qual � seu cpf?");
		String cpf = scanner.nextLine();
		Locacao l = new Pessoa(nome, sobrenome, cpf);
		Pessoa p = (Pessoa) l;
		System.out.println("Esses dados est�o corretos?");
		dados(p);
		String resposta = scanner.nextLine();
		if(resposta.equals("N�o")||resposta.equals("n�o")||resposta.equals("n")||resposta.equals("N")) {
			main(args);
		}
		verificaRegiao(scanner, l);
	}

	private static void banner() {
		System.out.println("-----------------------------------");
		System.out.println("----------Sun MicroPanels----------");
		System.out.println("-----------------------------------");
	}

	private static void verificaRegiao(Scanner scanner, Locacao l) {
		System.out.println("Qual � o seu estado?");
		String estado = scanner.nextLine();
		l.setEstado(estado);
		l.setRegiaoBrasil();
		Solar s = new Solar();
		s.setLocacao(l);
		System.out.println("Qual o gasto em KW em sua resid�ncia?");
		double gasto = scanner.nextDouble();
		s.quantidadeDePlacas(gasto);
		System.out.println("Voc� precisa de "+s.getPlacas()+" placas solares");
		String formataDouble = String.format("%.2f", s.getValorPlacas());
		System.out.println("O valor total � de R$"+formataDouble);
		System.out.println("Quer fazer uma nova consulta?");
		scanner.nextLine();
		String resp = scanner.nextLine();
		if(resp.equals("Sim")||resp.equals("sim")||resp.equals("S")||resp.equals("s")) {
			verificaRegiao(scanner, l);
		}
	}
	
	private static void dados(Pessoa p) {
		System.out.println("Nome:"+p.getNome());
		System.out.println("Sobrenome:"+p.getSobrenome());
		System.out.println("CPF:"+p.getCpf());
	}
}
