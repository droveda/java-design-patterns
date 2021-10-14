package org.example.study.builder;

import java.time.LocalDateTime;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDateTime dataEmissao;
    private double valorBruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String obs;

    public NotaFiscal(String razaoSocial, String cnpj, LocalDateTime dataEmissao, double valorBruto, double impostos, List<ItemDaNota> itens, String obs) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.obs = obs;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObs() {
        return obs;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", valorBruto=" + valorBruto +
                ", impostos=" + impostos +
                ", itens=" + itens +
                ", obs='" + obs + '\'' +
                '}';
    }
}
