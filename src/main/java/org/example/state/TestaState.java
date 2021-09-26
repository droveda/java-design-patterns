package org.example.state;

import org.example.strategy.Orcamento;

import java.math.BigDecimal;

public class TestaState {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 2);
        orcamento.aplicarDesconto();

        System.out.println(orcamento.getValor());

        orcamento.aprovar();
        orcamento.aplicarDesconto();

        System.out.println(orcamento.getValor());

        orcamento.finalizar();

        orcamento.reprovar();

    }

}
