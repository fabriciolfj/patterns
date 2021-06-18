package com.fabriciolfj.github.patterns.v2.comportamental.state.impl;

import com.fabriciolfj.github.patterns.v2.comportamental.state.EstadoPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends EstadoPedido {

    public EmAnalise(final Orcamento orcamento) {
        super(orcamento);
    }

    @Override
    public void aplicaDesconto() {
        var desconto = orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        orcamento.setValor(orcamento.getValor().subtract(desconto));
    }

    @Override
    public void aprovar() {
        orcamento.setEstadoPedido(new Aprovado(this.orcamento));
    }

    @Override
    public void reprovar() {
        orcamento.setEstadoPedido(new Reprovado(this.orcamento));
    }
}
