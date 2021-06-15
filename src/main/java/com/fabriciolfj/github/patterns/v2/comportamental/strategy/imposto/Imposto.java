package com.fabriciolfj.github.patterns.v2.comportamental.strategy.imposto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(final Orcamento orcamento);
}
