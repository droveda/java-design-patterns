package org.example.study.state;

import org.example.study.strategy.Orcamento;

public class TesteDescontoExtra {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);

        reforma.aplicaDesconto();

        System.out.println(reforma.getValor());

        reforma.aprova();

        reforma.aplicaDesconto();

        System.out.println(reforma.getValor());

        reforma.finaliza();

        reforma.aplicaDesconto();
    }

}
