package br.com.fernando.javanovo.lambda;

public class exThead {

    public static void main(String[] args) {

       new Thread(() ->
                System.out.println("Executando uma thread")
            ).start();

       FernandoFunctional f = () -> System.out.println("ola");

       f.fazer();

    }
}

@FunctionalInterface
interface FernandoFunctional{

     void fazer();

    default String app() {
        return "oi";
    }

}