package org.example.study.solid.coesao;

public class DezOuVintePorcento implements RegraDeCalculo {

    @Override
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000) {
            return funcionario.getSalarioBase() * 0.8;
        }

        return funcionario.getSalarioBase() * 0.9;
    }

}
