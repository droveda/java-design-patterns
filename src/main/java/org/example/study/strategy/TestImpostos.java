package org.example.study.strategy;

public class TestImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500);

        new CalculadorDeImposto().realizaCalculo(orcamento, iss);
        new CalculadorDeImposto().realizaCalculo(orcamento, icms);
    }

}
