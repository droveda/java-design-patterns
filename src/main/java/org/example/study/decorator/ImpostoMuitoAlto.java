package org.example.study.decorator;

import org.example.study.strategy.Imposto;
import org.example.study.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    public ImpostoMuitoAlto() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
    }
}
