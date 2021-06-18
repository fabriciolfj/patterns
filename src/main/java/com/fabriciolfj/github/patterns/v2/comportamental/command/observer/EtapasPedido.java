package com.fabriciolfj.github.patterns.v2.comportamental.command.observer;

import com.fabriciolfj.github.patterns.v2.comportamental.command.model.Pedido;

public interface EtapasPedido {

    void execute(final Pedido pedido);
}
