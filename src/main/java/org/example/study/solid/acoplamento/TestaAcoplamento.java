package org.example.study.solid.acoplamento;

import java.util.Arrays;
import java.util.List;

public class TestaAcoplamento {

    public static void main(String[] args) {
        List<AcaoAposGerarNota> acoes = Arrays.asList(new EnviadorDeEmail2(), new NotaFiscalDao2());

        GeradorNotaFiscal geradorNotaFiscal = new GeradorNotaFiscal(acoes);

        geradorNotaFiscal.gera(new Fatura(500));

        
    }

}
