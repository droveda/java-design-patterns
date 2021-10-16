package org.example.study.solid.encapsulamento;

public class Boleto {

    private final double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
