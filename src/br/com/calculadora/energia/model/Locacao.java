package br.com.calculadora.energia.model;

import br.com.calculadora.energia.excecoes.LocacaoException;

public abstract class Locacao {
	/**
	 * Atributo privado do tipo String do estado
	 */
	private String estado;
	/**
	 * Atributo privado do tipo String de regiaoBrasil
	 */
	private String regiaoBrasil;

	/**
	 * Metodo que retorna o valor encapsulado de estado
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Metodo que seta o valor de estado verificado a unidade federativa
	 * @param estado
	 */
	public void setEstado(String estado) {
		if (estado.equals("AC") || estado.equals("ac") || estado.equals("AM") || estado.equals("AM") 
				|| estado.equals("RO") || estado.equals("ro") || estado.equals("RR") || estado.equals("rr")
				|| estado.equals("PA") || estado.equals("pa") || estado.equals("AP") || estado.equals("ap")
				|| estado.equals("TO") || estado.equals("to") || estado.equals("MA") || estado.equals("ma")
				|| estado.equals("PI") || estado.equals("pi") || estado.equals("CE") || estado.equals("ce")
				|| estado.equals("RN") || estado.equals("rn") || estado.equals("PB") || estado.equals("pb")
				|| estado.equals("PE") || estado.equals("pe") || estado.equals("AL") || estado.equals("al")
				|| estado.equals("SE") || estado.equals("se") || estado.equals("BA") || estado.equals("ba")
				|| estado.equals("MT") || estado.equals("mt") || estado.equals("DE") || estado.equals("de")
				|| estado.equals("GO") || estado.equals("go") || estado.equals("MS") || estado.equals("ms")
				|| estado.equals("MG") || estado.equals("mg") || estado.equals("ES") || estado.equals("es")
				|| estado.equals("RJ") || estado.equals("rj") || estado.equals("SP") || estado.equals("sp")
				|| estado.equals("PR") || estado.equals("pr") || estado.equals("SC") || estado.equals("sc")
				|| estado.equals("RS") || estado.equals("rs")) {
			this.estado = estado.toUpperCase();
		} else {
			throw new LocacaoException("Unidade federatifa errada");
		}
	}

	/**
	 * Metodo que retorna o valor encapsulado de regiaoBrasil
	 * @return
	 */
	public String getRegiaoBrasil() {
		return regiaoBrasil;
	}

	/**
	 * Metodo privado que seta o valor da região do Brasil em relação a unidade federativa
	 * @param estado
	 */
	public void setRegiaoBrasil() {
		if (this.estado.equals("AC") || this.estado.equals("AM") || this.estado.equals("RO") || this.estado.equals("RR")
				|| this.estado.equals("PA") || this.estado.equals("TO") || this.estado.equals("AP")) {
			this.regiaoBrasil = "Norte".toUpperCase();
		} else if (this.estado.equals("MT") || this.estado.equals("MS") || this.estado.equals("GO") || this.estado.equals("DF")) {
			this.regiaoBrasil = "Centro-Oeste".toUpperCase();
		} else if (this.estado.equals("MA") || this.estado.equals("PI") || this.estado.equals("CE") || this.estado.equals("BA")
				|| this.estado.equals("SE") || this.estado.equals("AL") || this.estado.equals("PE") || this.estado.equals("PB")
				|| this.estado.equals("RN")) {
			this.regiaoBrasil = "Nordeste".toUpperCase();
		} else if (this.estado.equals("MG") || this.estado.equals("SP") || this.estado.equals("RJ") || this.estado.equals("ES")) {
			this.regiaoBrasil = "Sudeste".toUpperCase();
		} else {
			this.regiaoBrasil = "Sul".toUpperCase();
		}
	}

}
