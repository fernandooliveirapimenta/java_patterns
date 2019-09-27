package br.com.fernando.javanovo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OrdenaString {
    public static void main(String[] args) {

       List<String> palavras = new ArrayList<>();
       palavras.add("alura online");
       palavras.add("editora casa do código");
       palavras.add("caelum");

       palavras.sort(new ComparadorDeStringPorTamanho());
       Collections.sort(palavras, new ComparadorDeStringPorTamanho());

        System.out.println(palavras);

        palavras.forEach(new ConsumidorDeString());

    }
}


class ComparadorDeStringPorTamanho implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

class ConsumidorDeString implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

interface Fernando {

    default String appy(Supplier<String> s) {
       return s.get();
    }

    default void teste(String t) {
        System.out.println(t);
    }
}