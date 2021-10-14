package org.example.study.decorator2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TestaFiltroContas {

    public static void main(String[] args) {

        Filtro filtro = new SaldoMaiorQue500Mil(new AberturaMesmoMes());

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(500001, LocalDate.now().withMonth(Month.APRIL.getValue())));
        contas.add(new Conta(200, LocalDate.now()));
        contas.add(new Conta(1000, LocalDate.now().withMonth(Month.APRIL.getValue())));
        contas.add(new Conta(500, LocalDate.now().withMonth(Month.APRIL.getValue())));

        System.out.println(filtro.filtra(contas));


    }

}
