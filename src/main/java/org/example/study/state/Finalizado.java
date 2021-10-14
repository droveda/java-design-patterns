package org.example.study.state;

import org.example.study.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        throw new RuntimeException("Orcamento finalizado nao recebe desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Ja finalizado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Ja finalizado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Ja finalizado");
    }
}
