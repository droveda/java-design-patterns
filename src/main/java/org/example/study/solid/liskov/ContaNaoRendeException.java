package org.example.study.solid.liskov;

public class ContaNaoRendeException extends RuntimeException {
    public ContaNaoRendeException(String message) {
        super(message);
    }
}
