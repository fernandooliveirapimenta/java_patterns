package alura.comportamentais.strategy;

import alura.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, IEstrategiaCalculoImposto imposto){
        return imposto.calcular(orcamento);
    }
}
