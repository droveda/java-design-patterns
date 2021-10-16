package org.example.study.solid.encapsulamento;

import java.util.Arrays;
import java.util.List;

public class TestaEncapsulamento {

    public static void main(String[] args) {
        ProcessadorDeBoletos procc = new ProcessadorDeBoletos();


        List<Boleto> boletos = Arrays.asList(new Boleto(100), new Boleto(200), new Boleto(200));
        procc.processa(boletos, new Fatura2("Jose", 500));
    }

}
