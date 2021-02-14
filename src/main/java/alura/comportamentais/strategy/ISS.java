package alura.comportamentais.strategy;

import alura.Orcamento;

import java.math.BigDecimal;

public class ISS implements IEstrategiaCalculoImposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }
}
