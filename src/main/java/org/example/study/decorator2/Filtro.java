package org.example.study.decorator2;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    protected Filtro outroFiltro;

    public Filtro() {
    }

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> aplicaOutroFiltro(List<Conta> contas) {
        if (outroFiltro == null) {
            return new ArrayList<>();
        }
        return outroFiltro.filtra(contas);
    }

}
