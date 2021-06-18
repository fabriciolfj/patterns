package com.fabriciolfj.github.patterns.v2.comportamental.command.observer;

import com.fabriciolfj.github.patterns.v2.comportamental.command.model.Pedido;

public class PedidoRepository implements EtapasPedido {
    @Override
    public void execute(Pedido pedido) {
        System.out.println("Save: " + pedido.toString());
    }
}
