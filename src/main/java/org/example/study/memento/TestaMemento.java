package org.example.study.memento;

import java.time.LocalDate;

public class TestaMemento {

    public static void main(String[] args) {
        Historico historico = new Historico();

        Contrato c1 = new Contrato(LocalDate.now(), "Diegues", TipoContrato.NOVO);
        historico.adicionaEstado(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        historico.adicionaEstado(c1.salvaEstado());

        System.out.println(c1.getTipo());

        c1.avanca();
        historico.adicionaEstado(c1.salvaEstado());
        System.out.println(c1.getTipo());

        EstadoObjeto estadoAnterior = historico.pega(1);
        System.out.println(estadoAnterior.getContrato().getTipo());
    }

}
