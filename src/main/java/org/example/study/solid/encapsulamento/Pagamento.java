package org.example.study.solid.encapsulamento;

public class Pagamento {

    private final double valor;
    private final MeioDePagamento meioDePagamento;

    public Pagamento(double valor, MeioDePagamento meioDePagamento) {
        this.valor = valor;
        this.meioDePagamento = meioDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getMeioDePagamento() {
        return meioDePagamento;
    }
}
