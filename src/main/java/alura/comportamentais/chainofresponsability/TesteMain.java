package alura.comportamentais.chainofresponsability;

import alura.Orcamento;

import java.math.BigDecimal;

public class TesteMain {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(200), 6);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(1000), 1);

        CalculadoraDeDescontos cd = new CalculadoraDeDescontos();
        System.out.println(cd.calcular(orcamento));
        System.out.println(cd.calcular(orcamento2));




    }
}
