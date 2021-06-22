package com.fabriciolfj.github.patterns.v2.estruturais.decorated;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class Iss extends Imposto {

    public Iss(final Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal execute(final Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }
}
