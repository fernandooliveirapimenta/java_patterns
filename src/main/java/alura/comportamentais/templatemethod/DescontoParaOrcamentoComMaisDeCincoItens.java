package alura.comportamentais.templatemethod;

import alura.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends DescontoResponsability {

    public DescontoParaOrcamentoComMaisDeCincoItens(DescontoResponsability proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
