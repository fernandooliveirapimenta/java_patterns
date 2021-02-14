package alura.comportamentais.chainofresponsability;

import alura.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends DescontoResponsability {

    public DescontoParaOrcamentoComMaisDeCincoItens(DescontoResponsability proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }

        return proximo.calcular(orcamento);
    }
}
