package org.example.study.observer;

import org.example.study.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Envia por email");
    }

}
