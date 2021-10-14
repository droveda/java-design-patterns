package org.example.study.observer;

import org.example.study.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salva no banco");
    }

}
