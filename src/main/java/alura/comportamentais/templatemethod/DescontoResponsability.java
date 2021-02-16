package alura.comportamentais.templatemethod;

import alura.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoResponsability {

    DescontoResponsability proximo;

    public DescontoResponsability(DescontoResponsability proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
       if(deveAplicar(orcamento)){
           return efetuarCalculo(orcamento);
       }
       return proximo.calcular(orcamento);
    }

}
