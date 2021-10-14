package org.example.study.state;

import org.example.study.strategy.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {


    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos reprovados nao recebem desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Reprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Ja reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
