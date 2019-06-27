package com.java.patterns.java_patterns.commandpattern.mycommandpatternimpl;

public class MyCommandPatternDemo {

    public static void main(String[] args) {
       Carro carro = new Carro();
       Command acelerar = new Command1Impl(carro);
       Command parar = new Command2Impl(carro);

       Motor motor = new Motor();
       motor.addCommand(acelerar);
       motor.addCommand(parar);
       motor.init();
    }
}
