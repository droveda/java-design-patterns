package org.example.strategy;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
        System.out.println(calc.calcular(orcamento, new ICMS()));
    }

}
