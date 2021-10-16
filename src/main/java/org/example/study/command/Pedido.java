package org.example.study.command;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private LocalDateTime dataFinalizacao;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga() {
        status = Status.PAGO;
    }

    public void finaliza() {
        status = Status.ENTREGUE;
        dataFinalizacao = LocalDateTime.now();
    }

    public String getCliente() {
        return cliente;
    }
}
