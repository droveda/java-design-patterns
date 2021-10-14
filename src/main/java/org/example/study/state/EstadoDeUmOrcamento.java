package org.example.study.state;

import org.example.study.strategy.Orcamento;

public interface EstadoDeUmOrcamento {

    void aplicaDesconto(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);

}
