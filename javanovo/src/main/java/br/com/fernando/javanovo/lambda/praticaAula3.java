package br.com.fernando.javanovo.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class praticaAula3 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparingInt(s -> s.length()));
        palavras.sort(Comparator.comparingInt(String::length));
        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        palavras.forEach(System.out::println);

        Function<GlemaModel, GlebaDTO> f = glemaModel -> {
                GlebaDTO dto = new GlebaDTO();
                dto.id = glemaModel.id;
                return dto;
        };


    }
}

class GlemaModel {

    String id;
}

class GlebaDTO {
    String id;
}
