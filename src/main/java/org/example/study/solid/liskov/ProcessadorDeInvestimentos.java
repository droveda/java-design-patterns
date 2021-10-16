package org.example.study.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {
        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo saldo " + conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        List<ContaComum> result = new ArrayList<>();
        return result;
    }

}
