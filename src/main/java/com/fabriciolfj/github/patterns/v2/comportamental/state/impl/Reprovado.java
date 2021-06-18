package com.fabriciolfj.github.patterns.v2.comportamental.state.impl;

import com.fabriciolfj.github.patterns.v2.comportamental.state.EstadoPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends EstadoPedido {

    public Reprovado(final Orcamento orcamento) {
        super(orcamento);
    }

    @Override
    public void finalizar() {
        orcamento.setEstadoPedido(new Finalizado(orcamento));
    }
}
