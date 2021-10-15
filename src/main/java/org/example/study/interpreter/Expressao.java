package org.example.study.interpreter;

import org.example.study.visitor.ImpressoraVisitor;

public interface Expressao {

    int avalia();

    void aceita(ImpressoraVisitor impressora);

}
