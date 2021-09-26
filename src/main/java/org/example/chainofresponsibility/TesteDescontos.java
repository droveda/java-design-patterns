package org.example.chainofresponsibility;

import org.example.strategy.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();
        System.out.println(calc.calcular(orcamento));
        System.out.println(calc.calcular(orcamento2));
    }

}
