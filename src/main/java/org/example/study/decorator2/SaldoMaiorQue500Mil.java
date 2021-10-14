package org.example.study.decorator2;

import java.util.List;
import java.util.stream.Collectors;

public class SaldoMaiorQue500Mil extends Filtro {

    public SaldoMaiorQue500Mil() {
    }

    public SaldoMaiorQue500Mil(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> result = contas.stream().filter(c -> c.getSaldo() > 500000).collect(Collectors.toList());
        result.addAll(aplicaOutroFiltro(contas));

        return result;
    }
}
