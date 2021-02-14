package alura.comportamentais.chainofresponsability;

import alura.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoResponsability {

    DescontoResponsability proximo;

    public DescontoResponsability(DescontoResponsability proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
