package org.example.study.chain;

import org.example.study.strategy.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        //nothing
    }
}
