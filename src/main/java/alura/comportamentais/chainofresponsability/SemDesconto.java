package alura.comportamentais.chainofresponsability;

import alura.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends DescontoResponsability {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
