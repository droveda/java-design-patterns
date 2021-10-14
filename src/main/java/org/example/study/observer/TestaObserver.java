package org.example.study.observer;

import org.example.study.builder.ItemDaNota;
import org.example.study.builder.NotaFiscal;
import org.example.study.builder.NotaFiscalBuilder;

public class TestaObserver {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder()
                .empresa("Empresa A")
                .cnpj("12.,23232.3232")
                .comItem(new ItemDaNota("item 1", 200))
                .comItem(new ItemDaNota("item 2", 300))
                .comItem(new ItemDaNota("item 3", 400))
                .obs("OBS")
                .naDataAtual();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSMS());
        builder.adicionaAcao(new Impressora());
        builder.adicionaAcao(new Multiplicador(2));

        NotaFiscal nf = builder.build();


        System.out.println(nf);
    }

}
