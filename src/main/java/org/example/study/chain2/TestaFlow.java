package org.example.study.chain2;

public class TestaFlow {

    public static void main(String[] args) {
        FlowItem<String, Integer> p = new ProcessaCliente();
        Integer result = p.execute("Hello!");
        System.out.println(result);

        System.out.println("---------------\n\n");

        EnviaEmail<DadosCliente> enviaEmail = new EnviaEmail<>();
        DadosCliente d = new DadosClienteImpl();
        d.setCpf("11111111111");
        String result2 = enviaEmail.execute(d);
        System.out.println(result2);
    }

}
