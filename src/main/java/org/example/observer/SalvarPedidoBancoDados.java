package org.example.observer;

import org.example.command.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados...");
    }

}
