package org.example.study.decorator;

import org.example.study.strategy.ICMS;
import org.example.study.strategy.ISS;
import org.example.study.strategy.Imposto;
import org.example.study.strategy.Orcamento;

public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500);
        double valor = iss.calcula(orcamento);
        System.out.println(valor);

        Imposto i = new ImpostoMuitoAlto(new ICMS());
        Orcamento o2 = new Orcamento(100);
        double valor2 = i.calcula(o2);
        System.out.println(valor2);
    }

}
