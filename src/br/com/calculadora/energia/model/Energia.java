package br.com.calculadora.energia.model;

public interface Energia {
/**
 * Atributo auxiliar para usar quilowatts
 */
public static final double KW = 1000;
/**
 * Metodo de verifica��o do valor de irradia��o em rela��o a regi�o que mora no Brasil
 * @return
 */
public double valorEnergiaRegi�o();
}
