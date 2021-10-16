package org.example.study.solid.openclosed;

public class CalculadoraDePrecos {

    private final TabelaDePreco tabelaDePreco;
    private final ServicoDeEntrega servicoDeEntrega;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega servicoDeEntrega) {
        this.tabelaDePreco = tabelaDePreco;
        this.servicoDeEntrega = servicoDeEntrega;
    }

    public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double freteValor = servicoDeEntrega.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + freteValor;
    }

}
