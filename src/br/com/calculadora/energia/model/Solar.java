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
	 * Metodo que retorna o valor encapsulado das placas
	 * @return
	 */
	public int getPlacas() {
		return placas;
	}

	/**
	 * Metodo que seta o valor das placas
	 * @param placas
	 */
	public void setPlacas(int placas) {
		this.placas = placas;
	}

	/**
	 * Metodo que retorna o valor encapsulado do valor das placas
	 * @return
	 */
	public double getValorPlacas() {
		return valorPlacas;
	}

	/**
	 * Metodo que seta o valor total baseado na quantidade de placas
	 * @param valorPlacas
	 */
	public void setValorPlacas(int valorPlacas) {
		this.valorPlacas = 779.90 * valorPlacas;
	}

	/**
	 * Metodo que retorna o valor encapsulado de locacao
	 * @return
	 */
	public Locacao getLocacao() {
		return locacao;
	}
	
	/**
	 * Metodo que seta o valor de locacao
	 * @param locacao
	 */
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	/**
	 * Metodo que retorna um numero real baseado na irradiação de cada região do Brasil
	 */
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

	/**
	 * Metodo que recebe o valor de gasto mensal de energia do úsuario. Com o valor da irradiação 
	 * baseado na região já feitas, ele determina quantas placas solares é necessário
	 * @param gastoEnergia
	 */
	public void quantidadeDePlacas(double gastoEnergia) {
		double mediaDiaria = (gastoEnergia*Energia.KW)/ 30 ;
		double retornoIrradiacao = mediaDiaria/this.valorEnergiaRegião();
		int numeroPlacas = (int) Math.round(retornoIrradiacao/Solar.WATTS);
		this.setPlacas(numeroPlacas);
		this.setValorPlacas(numeroPlacas);
	}

}
