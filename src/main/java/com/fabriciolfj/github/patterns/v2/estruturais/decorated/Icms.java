package com.fabriciolfj.github.patterns.v2.estruturais.decorated;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class Icms extends Imposto {

    public Icms(final Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal execute(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.18));
    }
}
