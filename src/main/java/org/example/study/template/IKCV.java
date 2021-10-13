package org.example.study.template;

import org.example.study.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(i -> i.getValor() > 100);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }
}
