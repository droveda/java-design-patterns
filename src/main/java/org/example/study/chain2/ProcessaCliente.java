package org.example.study.chain2;

import java.util.Random;

public class ProcessaCliente implements FlowItem<String, Integer> {

    @Override
    public Integer execute(String s) {
        System.out.println(s);
        return new Random().nextInt(6) + 1;
    }
}
