package com.fabriciolfj.github.patterns.v2.comportamental.strategy.imposto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(final Orcamento orcamento, final Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
