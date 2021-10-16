package org.example.study.solid.liskov;

public class ContaEstudante {

    private int milhas;

    private ManipuladorDeSaldo m;

    public ContaEstudante() {
        m = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        m.deposita(valor);
        this.milhas += (int) valor;
    }

    public int getMilhas() {
        return milhas;
    }

}
