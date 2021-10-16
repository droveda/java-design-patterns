package org.example.study.solid.openclosed;

public class Compra {

    private final double valor;
    private final String cidade;


    public Compra(double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public double getValor() {
        return valor;
    }
}
