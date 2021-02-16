package alura.comportamentais.state;

import alura.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
