package org.example.study.chain;

import org.example.study.strategy.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();
        Orcamento orcamento = new Orcamento(600);

        orcamento.adicionaItens(new Item("Caneta", 250));
        orcamento.adicionaItens(new Item("Lapis", 250));

        double valor = descontos.calcula(orcamento);
        System.out.println(valor);
    }

}
