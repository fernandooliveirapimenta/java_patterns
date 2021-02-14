package alura.comportamentais.strategy;

import alura.Orcamento;

import java.math.BigDecimal;

public class ICMS implements IEstrategiaCalculoImposto{

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }
}
