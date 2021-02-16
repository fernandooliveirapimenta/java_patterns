package alura.comportamentais.templatemethod;

import alura.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends DescontoResponsability {

    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
