package org.example.observer;

import org.example.command.GeraPedido;
import org.example.command.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestaObserver {

    public static void main(String[] args) {

        GeraPedido geraPedido = new GeraPedido("Joao", new BigDecimal("100"), 1);
        List<AcaoAposGerarPedido> acoes = new ArrayList<>();
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(acoes);
        geraPedidoHandler.subscribe(new SalvarPedidoBancoDados());
        geraPedidoHandler.subscribe(new EnviarEmailPedido());

        geraPedidoHandler.execute(geraPedido);

    }

}
