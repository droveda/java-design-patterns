package org.example.study.state;

import org.example.study.strategy.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Em aprovacao nao pode ser fianlziado");
    }
}
