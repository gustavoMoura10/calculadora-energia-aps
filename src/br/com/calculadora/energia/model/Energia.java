package br.com.calculadora.energia.model;

public interface Energia {
/**
 * Atributo auxiliar para usar quilowatts
 */
public static final double KW = 1000;
/**
 * Metodo de verificação do valor de irradiação em relação a região que mora no Brasil
 * @return
 */
public double valorEnergiaRegião();
}
