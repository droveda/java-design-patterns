package org.example.study.chain2;

public class DadosClienteImpl implements DadosCliente {

    private String cpf;

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCpf() {
        return cpf;
    }
}
