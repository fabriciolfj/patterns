package com.fabriciolfj.github.patterns.v2.estruturais.decorated;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Imposto {

    private Imposto outroImposo;
    protected abstract BigDecimal execute(final Orcamento orcamento);

    public BigDecimal realizarCalculo(final Orcamento orcamento) {
        var imposto = execute(orcamento);

        if (Objects.nonNull(outroImposo)) {
            var valorOutroImposto = outroImposo.execute(orcamento);
            imposto = imposto.add(valorOutroImposto);
        }

        return imposto;
    }

}
