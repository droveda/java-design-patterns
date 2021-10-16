package org.example.study.solid.encapsulamento;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura2 fatura) {

        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adcionaPagamento(pagamento);
        }

    }

}
