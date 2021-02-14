package alura.comportamentais.strategy;

import alura.Orcamento;

import java.math.BigDecimal;

public interface IEstrategiaCalculoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
