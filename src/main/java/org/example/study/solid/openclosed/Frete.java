package org.example.study.solid.openclosed;

public class Frete implements ServicoDeEntrega {

    @Override
    public double para(String cidade) {
        if ("SAO PAULO".equals(cidade)) {
            return 15;
        }
        return 30;
    }

}
