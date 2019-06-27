package com.java.patterns.java_patterns.commandpattern.mycommandpatternimpl;

public class Command1Impl implements Command {

    private Carro carro;

    public Command1Impl(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void execute() {
        carro.andar();
    }
}
