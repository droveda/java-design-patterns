package org.example.study.solid.acoplamento;

public class NotaFiscalDao2 implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal2 nf) {
        System.out.println("salva nf no banco");
    }
}
