package org.example.study.chain2;

public interface FlowItem<I, O> {

    O execute(I i);

}
