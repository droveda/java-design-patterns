package org.example.study.solid.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura2 {

    private boolean pago;
    private List<Pagamento> pagamentos;
    private double valor;
    private String cliente;

    public Fatura2(String cliente, double valor) {
        this.pago = false;
        this.pagamentos = new ArrayList<>();
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }


    public void adcionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);

        if (valorTotalPagamentos() >= this.valor) {
            System.out.println("Fafura esta paga");
            this.pago = true;
        } else {
            System.out.println("Não pago ainda...");
        }
    }

    private double valorTotalPagamentos() {
        return pagamentos.stream().mapToDouble(Pagamento::getValor).sum();
    }

}
