package org.example.study.decorator2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class AberturaMesmoMes extends Filtro {

    public AberturaMesmoMes() {
    }

    public AberturaMesmoMes(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {

        List<Conta> result = contas.stream().filter(
                        c -> c.getDataAbertura().getMonth().equals(LocalDate.now().getMonth()))
                .collect(Collectors.toList());
        result.addAll(aplicaOutroFiltro(contas));

        return result;
    }
}
