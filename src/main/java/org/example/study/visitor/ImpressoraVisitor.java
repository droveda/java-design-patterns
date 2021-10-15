package org.example.study.visitor;

import org.example.study.interpreter.Numero;
import org.example.study.interpreter.Soma;
import org.example.study.interpreter.Subtracao;

public class ImpressoraVisitor {

    public void visitaSoma(Soma soma) {
        System.out.print("(");

        //equerda
        soma.getEsquerda().aceita(this);

        System.out.print("+");


        //direita
        soma.getDireita().aceita(this);

        System.out.print(")");
    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print("(");

        //equerda
        subtracao.getEsquerda().aceita(this);

        System.out.print("-");

        //direita
        subtracao.getDireita().aceita(this);

        System.out.print(")");
    }

    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

}
