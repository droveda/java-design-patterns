package org.example.study.state;

import org.example.study.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Ja aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Ja aprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
