package org.example.chainofresponsibility;

import org.example.strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQue500 extends Desconto {

    public DescontoValorMaiorQue500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
