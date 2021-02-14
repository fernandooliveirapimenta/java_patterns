package alura.estruturais.adapter;

import alura.Orcamento;
import alura.comportamentais.strategy.CalculadoraDeImpostos;
import alura.comportamentais.strategy.ICMS;
import alura.comportamentais.strategy.ISS;

import java.math.BigDecimal;

public class TesteMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(7500.90), 3);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal icms = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        BigDecimal iss = calculadoraDeImpostos.calcular(orcamento, new ISS());
        System.out.println(icms);
        System.out.println(iss);

    }
}
