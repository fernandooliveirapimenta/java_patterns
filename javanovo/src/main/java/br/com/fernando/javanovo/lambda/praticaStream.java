package br.com.fernando.javanovo.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class praticaStream {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));


        cursos.sort(Comparator.comparingInt(Curso::getAlunos).reversed());
        cursos.forEach(n -> System.out.println(n.getNome()));

        Stream<Curso> stream = cursos.stream();

        final Stream<Curso> cursoStream = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100);

        final Curso curso = cursos.stream()
                .max(Comparator.comparingInt(Curso::getAlunos)).orElse(null);

        System.out.println(curso.getNome());

        System.out.println(cursos.stream().mapToInt(Curso::getAlunos).sum());

        final Optional<Curso> co = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny();

        co.ifPresent(c -> System.out.println(c.getNome()));

         cursos
                .stream()
                 .distinct()
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
                .forEach((n, a) -> System.out.println(n + " " + a));


    }
}

class Curso {

    public Curso() {

    }
    String nome;
   public int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Curso curso = (Curso) o;

        return nome != null ? nome.equals(curso.nome) : curso.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
