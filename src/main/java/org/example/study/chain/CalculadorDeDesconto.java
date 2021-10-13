package org.example.study.chain;

import org.example.study.strategy.Orcamento;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPor5Itens();
        Desconto d2 = new DescontoPorMaisDe500Reais();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);
    }

}
