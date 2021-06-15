package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public abstract class Desconto {

    private Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);

    protected BigDecimal calcProximo(Orcamento orcamento) {
        return proximo.calcular(orcamento);
    }

}
