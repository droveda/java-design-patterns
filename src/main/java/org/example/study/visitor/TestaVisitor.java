package org.example.study.visitor;

import org.example.study.interpreter.Expressao;
import org.example.study.interpreter.Numero;
import org.example.study.interpreter.Soma;
import org.example.study.interpreter.Subtracao;

public class TestaVisitor {

    public static void main(String[] args) {

        Expressao e = new Soma(new Numero(10), new Numero(20));

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        int resultado = soma.avalia();
        System.out.println(resultado);

        ImpressoraVisitor impressora = new ImpressoraVisitor();
        soma.aceita(impressora);
    }

}
