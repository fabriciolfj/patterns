package com.fabriciolfj.github.patterns.v2.estruturais.proxy;

import com.fabriciolfj.github.patterns.v2.estruturais.composite.Orcamento;
import com.fabriciolfj.github.patterns.v2.estruturais.composite.Orcavel;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(final Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (this.valor == null) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}
