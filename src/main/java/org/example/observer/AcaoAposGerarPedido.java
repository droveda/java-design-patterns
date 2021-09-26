package org.example.observer;

import org.example.command.Pedido;

public interface AcaoAposGerarPedido {

    void executaAcao(Pedido pedido);

}
