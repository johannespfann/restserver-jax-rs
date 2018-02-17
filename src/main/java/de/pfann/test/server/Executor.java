package de.pfann.test.server;

public class Executor {

    public void executeRuntimeException() throws IllegalArgumentException {
        System.out.println("execute");
        throw new IllegalArgumentException();
    }

    public void executeException() throws ClassNotFoundException {
        System.out.println("execute Exception");
        throw new ClassNotFoundException();
    }
}
