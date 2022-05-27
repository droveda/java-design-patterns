package org.example.study.chain2;

public class EnviaEmail<I extends DadosCliente> implements FlowItem<I, String> {


    @Override
    public String execute(I dadosCliente) {
        System.out.println(dadosCliente.getCpf());
        return "Terminou processamento EnviaEmail";
    }
}
