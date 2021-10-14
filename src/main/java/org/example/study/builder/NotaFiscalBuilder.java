package org.example.study.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<>();
    private double valorBruto;
    private double impostos;
    private String obs;
    private LocalDateTime data;


    public NotaFiscalBuilder empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder obs(String obs) {
        this.obs = obs;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = LocalDateTime.now();
        return this;
    }

    public NotaFiscal build() {
        return new NotaFiscal(razaoSocial,
                cnpj,
                data,
                valorBruto,
                impostos,
                todosItens,
                obs);
    }

}
