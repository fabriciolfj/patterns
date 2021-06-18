package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public abstract class Desconto {

    private Desconto proximo;
    protected abstract boolean isAplica(final Orcamento orcamento);
    protected abstract BigDecimal calculo(final Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (isAplica(orcamento)) {
            return calculo(orcamento);
        }

        return calcProximo(orcamento);
    }

    protected BigDecimal calcProximo(final Orcamento orcamento) {
        return proximo.calcular(orcamento);
    }


}
