package org.example.study.decorator2;

import java.util.List;
import java.util.stream.Collectors;

public class SaldoMenorQue100 extends Filtro {

    public SaldoMenorQue100() {
    }

    public SaldoMenorQue100(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> result = contas.stream().filter(c -> c.getSaldo() < 100).collect(Collectors.toList());
        result.addAll(aplicaOutroFiltro(contas));

        return result;
    }
}
