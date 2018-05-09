package br.com.calculadora.energia.model;

public class Solar implements Energia{
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


	@Override
	public double valorEnergia() {
		
		return 0;
	}

}
