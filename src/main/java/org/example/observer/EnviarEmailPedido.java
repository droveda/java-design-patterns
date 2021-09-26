package org.example.observer;

import org.example.command.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido...");
    }


}
