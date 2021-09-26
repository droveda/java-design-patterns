package org.example.command;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TestaCommand {

    public static void main(String[] args) {

        String cliente = "Joao";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(new ArrayList<>());
        handler.execute(gerador);
    }

}
