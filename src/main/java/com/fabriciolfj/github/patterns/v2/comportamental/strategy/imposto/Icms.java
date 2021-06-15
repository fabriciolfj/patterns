package com.fabriciolfj.github.patterns.v2.comportamental.strategy.imposto;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class Icms implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
