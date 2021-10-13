package org.example.study.chain;

import org.example.study.strategy.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto proximo);

}
