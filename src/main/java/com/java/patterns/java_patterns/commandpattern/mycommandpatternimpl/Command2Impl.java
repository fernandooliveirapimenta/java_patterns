package com.java.patterns.java_patterns.commandpattern.mycommandpatternimpl;

public class Command2Impl implements Command {

    private Carro carro;

    public Command2Impl(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void execute() {
        carro.parar();
    }
}
