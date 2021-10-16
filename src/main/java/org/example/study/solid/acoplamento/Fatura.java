package org.example.study.solid.acoplamento;

public class Fatura {

    private final double valorMensal;

    public Fatura(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public double getValorMensal() {
        return valorMensal;
    }
}
