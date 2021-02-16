package alura.comportamentais.templatemethod;

import alura.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQue500 extends DescontoResponsability {

    public DescontoComValorMaiorQue500(DescontoResponsability proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {

        return orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0;
    }
}
