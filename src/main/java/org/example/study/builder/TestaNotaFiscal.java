package org.example.study.builder;

public class TestaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder()
                .empresa("Empresa A")
                .cnpj("12.,23232.3232")
                .comItem(new ItemDaNota("item 1", 200))
                .comItem(new ItemDaNota("item 2", 300))
                .comItem(new ItemDaNota("item 3", 400))
                .obs("OBS")
                .naDataAtual();

        NotaFiscal nf = builder.build();

        System.out.println(nf);

    }

}
