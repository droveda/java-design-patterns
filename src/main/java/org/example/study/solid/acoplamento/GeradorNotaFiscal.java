package org.example.study.solid.acoplamento;

import java.util.List;

public class GeradorNotaFiscal {

    private List<AcaoAposGerarNota> acoes;

    public GeradorNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal2 gera(Fatura fatura) {

        double valor = fatura.getValorMensal();
        NotaFiscal2 notaFiscal2 = new NotaFiscal2(valor, impostoSimpleSobreO(valor));

        acoes.forEach(a -> a.executa(notaFiscal2));

        return notaFiscal2;
    }

    private double impostoSimpleSobreO(double valor) {
        return valor * 0.06;
    }
}
