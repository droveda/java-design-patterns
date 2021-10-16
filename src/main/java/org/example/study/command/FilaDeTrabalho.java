package org.example.study.command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

    private List<Comando> comandos;

    public FilaDeTrabalho() {
        comandos = new ArrayList<>();
    }

    public void add(Comando comando) {
        this.comandos.add(comando);
    }

    public void processa() {
        comandos.forEach(Comando::executa);
    }

}
