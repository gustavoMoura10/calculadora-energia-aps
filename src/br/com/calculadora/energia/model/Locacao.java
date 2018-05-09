package br.com.calculadora.energia.model;

import br.com.calculadora.energia.excecoes.LocacaoException;

public abstract class Locacao {
	private String estado;
	private String regiaoBrasil;

	public String getEstado() {
		return estado;
	}

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

	public String getRegiaoBrasil() {
		return regiaoBrasil;
	}

	public void setRegiaoBrasil(String estado) {
		if (estado.equals("AC") || estado.equals("AM") || estado.equals("RO") || estado.equals("RR")
				|| estado.equals("PA") || estado.equals("TO") || estado.equals("AP")) {
			this.regiaoBrasil = "Norte".toUpperCase();
		} else if (estado.equals("MT") || estado.equals("MS") || estado.equals("GO") || estado.equals("DF")) {
			this.regiaoBrasil = "Centro-Oeste".toUpperCase();
		} else if (estado.equals("MA") || estado.equals("PI") || estado.equals("CE") || estado.equals("BA")
				|| estado.equals("SE") || estado.equals("AL") || estado.equals("PE") || estado.equals("PB")
				|| estado.equals("RN")) {
			this.regiaoBrasil = "Nordeste".toUpperCase();
		} else if (estado.equals("MG") || estado.equals("SP") || estado.equals("RJ") || estado.equals("ES")) {
			this.regiaoBrasil = "Sudeste".toUpperCase();
		} else {
			this.regiaoBrasil = "Sul".toUpperCase();
		}
	}

}
