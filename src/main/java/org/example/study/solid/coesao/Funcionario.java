package org.example.study.solid.coesao;

public class Funcionario {

    private final double salarioBase;
    private final Cargo cargo;

    public Funcionario(double salarioBase, Cargo cargo) {
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double calculaSalario() {
        return cargo.getRegra().calcula(this);
    }

    enum Cargo {
        DESENVOLVEDOR(new DezOuVintePorcento()),
        DBA(new QuinzeOu25Porcento()),
        TESTER(new QuinzeOu25Porcento());

        private RegraDeCalculo regraDeCalculo;

        Cargo(RegraDeCalculo regraDeCalculo) {
            this.regraDeCalculo = regraDeCalculo;
        }

        public RegraDeCalculo getRegra() {
            return regraDeCalculo;
        }
    }
}
