package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class OrcamentoValorAcima500 extends Desconto {

    public OrcamentoValorAcima500(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean isAplica(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }

    @Override
    protected BigDecimal calculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.03));
    }
}
