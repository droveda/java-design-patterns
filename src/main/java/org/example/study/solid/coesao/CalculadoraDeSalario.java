package org.example.study.solid.coesao;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {

        return funcionario.calculaSalario();

    }

    public static void main(String[] args) {
        double calcula = new CalculadoraDeSalario().calcula(new Funcionario(1000, Funcionario.Cargo.DESENVOLVEDOR));
        System.out.println(calcula);
    }

}
