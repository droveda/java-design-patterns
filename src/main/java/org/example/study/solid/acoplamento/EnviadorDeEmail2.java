package org.example.study.solid.acoplamento;

public class EnviadorDeEmail2 implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal2 nf) {
        System.out.println("Envia email da nf");
    }
}
