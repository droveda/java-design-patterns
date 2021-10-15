package org.example.study.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<EstadoObjeto> estadosSalvos = new ArrayList<>();

    public void adicionaEstado(EstadoObjeto estadoObjeto) {
        estadosSalvos.add(estadoObjeto);
    }

    public EstadoObjeto pega(int index) {
        return estadosSalvos.get(index);
    }

}
