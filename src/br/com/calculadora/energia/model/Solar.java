package br.com.calculadora.energia.model;

public class Solar implements Energia {
	private int placas;
	private Locacao locacao;

	public int getPlacas() {
		return placas;
	}

	public void setPlacas(int placas) {
		this.placas = placas;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public void valorEnergiaPorRegiao() {
		switch (this.getLocacao().getRegiaoBrasil()) {
		case "NORTE":
			this.quantidadeDePlacas(5.5);
			break;
		case "NORDESTE":
			this.quantidadeDePlacas(5.9);
			break;
		case "CENTRO-OESTE":
			this.quantidadeDePlacas(5.7);
			break;
		case "SUDESTE":
			this.quantidadeDePlacas(5.6);
			break;
		case "SUL":
			this.quantidadeDePlacas(5.2);
			break;
		default:
			this.quantidadeDePlacas(0);
			break;
		}
	}

	public int quantidadeDePlacas(double d) {
		return 0;
	}

}
