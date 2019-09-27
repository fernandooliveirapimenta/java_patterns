package br.com.fernando.javanovo.lambda;

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

       palavras.sort(Comparator.comparingInt(String::length).reversed());

        palavras.forEach(System.out::println);

        palavras.forEach(System.out::println);

        Consumer<String> cc = System.out::println;

        cc.accept("fefe");

        palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

    }
}


