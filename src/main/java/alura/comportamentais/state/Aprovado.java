package alura.comportamentais.state;

import alura.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
