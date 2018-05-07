package br.com.calculadora.energia.model;

public class Solar implements Energia{
	private int placas;
	private Locacao locacao;
	
	@Override
	public double valorEnergia() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int radiacaoPorEstado() {
		switch (locacao.getFederacao()) {
		case "AC":
			return 16;
			break;

		default:
			return 0;
			break;
		}
	}

}
