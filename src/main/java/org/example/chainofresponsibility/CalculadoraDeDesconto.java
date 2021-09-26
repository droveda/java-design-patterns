package org.example.chainofresponsibility;

import org.example.strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        return new DescontoMaisDe5Itens(
                new DescontoValorMaiorQue500(
                        new SemDesconto()))
                .calcular(orcamento);
    }

}
