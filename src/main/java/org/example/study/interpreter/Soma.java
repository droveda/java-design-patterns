package org.example.study.interpreter;

import org.example.study.visitor.ImpressoraVisitor;

public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorE = esquerda.avalia();
        int valorD = direita.avalia();

        return valorE + valorD;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public void aceita(ImpressoraVisitor impressora) {
        impressora.visitaSoma(this);
    }
}
