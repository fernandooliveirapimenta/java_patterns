package alura.comportamentais.chainofresponsability;

import alura.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQue500 extends DescontoResponsability {

    public DescontoComValorMaiorQue500(DescontoResponsability proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        }

        return proximo.calcular(orcamento);
    }
}
