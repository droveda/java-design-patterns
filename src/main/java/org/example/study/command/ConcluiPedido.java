package org.example.study.command;

public class ConcluiPedido implements Comando {

    private final Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Concluindo pedido do " + pedido.getCliente());
        pedido.finaliza();
    }
}
