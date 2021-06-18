package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class OrcamentoAcima5Itens extends Desconto {

    public OrcamentoAcima5Itens(final Desconto desconto) {
        super(desconto);
    }

    @Override
    protected boolean isAplica(Orcamento orcamento) {
        return orcamento.getQtde() >= 5;
    }

    @Override
    protected BigDecimal calculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }
}
