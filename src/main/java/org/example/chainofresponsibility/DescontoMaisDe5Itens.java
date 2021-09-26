package org.example.chainofresponsibility;

import org.example.strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDe5Itens extends Desconto {

    public DescontoMaisDe5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
