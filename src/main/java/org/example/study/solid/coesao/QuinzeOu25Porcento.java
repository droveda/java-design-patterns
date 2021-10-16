package org.example.study.solid.coesao;

public class QuinzeOu25Porcento implements RegraDeCalculo {

    @Override
    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 2000) {
            return funcionario.getSalarioBase() * 0.75;
        }

        return funcionario.getSalarioBase() * 0.85;
    }

}
