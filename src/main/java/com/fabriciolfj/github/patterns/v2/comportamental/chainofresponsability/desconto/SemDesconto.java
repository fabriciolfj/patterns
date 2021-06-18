package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    protected boolean isAplica(Orcamento orcamento) {
        return true;
    }

    @Override
    protected BigDecimal calculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
