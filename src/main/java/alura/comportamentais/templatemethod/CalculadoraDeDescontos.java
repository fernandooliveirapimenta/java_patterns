package alura.comportamentais.templatemethod;

import alura.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        SemDesconto semDesconto = new SemDesconto();

        DescontoComValorMaiorQue500 prox = new DescontoComValorMaiorQue500(semDesconto);

        BigDecimal desconto = new DescontoParaOrcamentoComMaisDeCincoItens(prox).calcular(orcamento);

        return desconto;
    }
}
