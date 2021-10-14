package org.example.study.decorator2;

import java.time.LocalDate;

public class Conta {

    private final double saldo;
    private final LocalDate dataAbertura;

    public Conta(double saldo, LocalDate dataAbertura) {
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';
    }
}
