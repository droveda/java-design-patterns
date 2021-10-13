package org.example.study.template;

import org.example.study.strategy.Imposto;
import org.example.study.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        }
        return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);


}
