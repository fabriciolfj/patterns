package com.fabriciolfj.github.patterns.v2.comportamental.state.impl;

import com.fabriciolfj.github.patterns.v2.comportamental.state.EstadoPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends EstadoPedido {

    public Finalizado(final Orcamento orcamento) {
        super(orcamento);
    }

}
