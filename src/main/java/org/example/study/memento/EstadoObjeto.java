package org.example.study.memento;

public class EstadoObjeto {

    private Contrato contrato;

    public EstadoObjeto(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }
}
