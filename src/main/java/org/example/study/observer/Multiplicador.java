package org.example.study.observer;

import org.example.study.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

    private double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Multiplicador " + notaFiscal.getValorBruto() * fator);
    }
}
