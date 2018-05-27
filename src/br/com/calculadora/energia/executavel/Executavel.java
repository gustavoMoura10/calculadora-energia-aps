package br.com.calculadora.energia.executavel;

import java.util.Scanner;

import br.com.calculadora.energia.model.Locacao;
import br.com.calculadora.energia.model.Pessoa;
import br.com.calculadora.energia.model.Solar;

public class Executavel {
	/**
	 * Metodo de execução main
	 * @param args
	 */
	public static void main(String[] args) {
		banner();
		/**
		 * O objeto de scanner vai receber os dados
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é seu nome?");
		String nome = scanner.nextLine();
		System.out.println("Qual é seu sobrenome?");
		String sobrenome = scanner.nextLine();
		System.out.println("Qual é seu cpf?");
		String cpf = scanner.nextLine();
		Locacao l = new Pessoa(nome, sobrenome, cpf);
		Pessoa p = (Pessoa) l;
		System.out.println("Esses dados estão corretos?");
		/**
		 * Será mostrado os dados na tela para verificar se está correto
		 */
		dados(p);
		String resposta = scanner.nextLine();
		/**
		 * Se a resposta for não ele executa novamente o main
		 */
		if(resposta.equals("Não")||resposta.equals("não")||resposta.equals("n")||resposta.equals("N")) {
			main(args);
		}
		/**
		 * Metodo que verifica os dados da região do úsuario
		 */
		verificaRegiao(scanner, l);
	}

	/**
	 * Banner do logo da empresa
	 */
	private static void banner() {
		System.out.println("-----------------------------------");
		System.out.println("----------Sun MicroPanels----------");
		System.out.println("-----------------------------------");
	}

	/**
	 * Metodo que verifica qual é a região que o úsuario reside
	 * @param scanner
	 * @param l
	 */
	private static void verificaRegiao(Scanner scanner, Locacao l) {
		System.out.println("Qual é o seu estado?");
		String estado = scanner.nextLine();
		l.setEstado(estado);
		l.setRegiaoBrasil();
		Solar s = new Solar();
		s.setLocacao(l);
		System.out.println("Qual o gasto em KW em sua residência?");
		double gasto = scanner.nextDouble();
		s.quantidadeDePlacas(gasto);
		System.out.println("Você precisa de "+s.getPlacas()+" placas solares");
		String formataDouble = String.format("%.2f", s.getValorPlacas());
		System.out.println("O valor total é de R$"+formataDouble);
		System.out.println("Quer fazer uma nova consulta?");
		scanner.nextLine();
		String resp = scanner.nextLine();
		/**
		 * Se a resposta for sim será novamente executado o metodo novamente
		 */
		if(resp.equals("Sim")||resp.equals("sim")||resp.equals("S")||resp.equals("s")) {
			verificaRegiao(scanner, l);
		}
	}
	
	/**
	 * Metodo que expõe os dados da pessoa
	 * @param p
	 */
	private static void dados(Pessoa p) {
		System.out.println("Nome:"+p.getNome());
		System.out.println("Sobrenome:"+p.getSobrenome());
		System.out.println("CPF:"+p.getCpf());
	}
}
