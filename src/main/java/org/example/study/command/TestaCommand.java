package org.example.study.command;

public class TestaCommand {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Diegues", 150);
        Pedido pedido2 = new Pedido("Marcelo", 250);

        FilaDeTrabalho f = new FilaDeTrabalho();
        f.add(new PagaPedido(pedido1));
        f.add(new PagaPedido(pedido2));
        f.add(new ConcluiPedido(pedido1));

        f.processa();

    }

}
