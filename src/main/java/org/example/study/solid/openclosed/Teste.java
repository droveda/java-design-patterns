package org.example.study.solid.openclosed;

public class Teste {

    public static void main(String[] args) {
        TabelaDePreco tabela = new TabelaDePrecoPadrao();
        ServicoDeEntrega entrega = new Frete();

        CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
        double valor = calculadora.calcula(new Compra(1000, "Sao Paulo"));

        System.out.println(valor);
    }

}
