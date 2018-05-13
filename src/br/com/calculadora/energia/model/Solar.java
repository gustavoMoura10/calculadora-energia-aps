package br.com.calculadora.energia.model;

public class Solar implements Energia {
	/**
	 * Atributo privado do tipo int da quantidade de placas
	 */
	private int placas;
	/**
	 * Atributo privado do tipo double que dá o valor total de placas
	 */
	private double valorPlacas;
	/**
	 * Atributo privado que se refere ao objeto Locacao
	 */
	private Locacao locacao;
	/**
	 * Atributo privado estático do tipo double que dá o valor de watts gerado por cada painel
	 */
	private static double WATTS = 240;

	/**
	 * 
	 * @return
	 */
	public int getPlacas() {
		return placas;
	}

	public void setPlacas(int placas) {
		this.placas = placas;
	}

	public double getValorPlacas() {
		return valorPlacas;
	}

	public void setValorPlacas(int valorPlacas) {
		this.valorPlacas = 779.90 * valorPlacas;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public double valorEnergiaRegião() {
		switch (this.getLocacao().getRegiaoBrasil()) {
		case "NORTE":
			return 5.5;
		case "NORDESTE":
			return 5.9;
		case "CENTRO-OESTE":
			return 5.7;
		case "SUDESTE":
			return 5.6;
		case "SUL":
			return 5.2;
		default:
			return 0;
		}
	}

	public void quantidadeDePlacas(double gastoEnergia) {
		double mediaDiaria = (gastoEnergia*Energia.KW)/ 30 ;
		double retornoIrradiacao = mediaDiaria/this.valorEnergiaRegião();
		int numeroPlacas = (int) Math.round(retornoIrradiacao/Solar.WATTS);
		this.setPlacas(numeroPlacas);
		this.setValorPlacas(numeroPlacas);
	}

}
