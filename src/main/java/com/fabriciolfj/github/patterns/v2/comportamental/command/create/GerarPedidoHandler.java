package com.fabriciolfj.github.patterns.v2.comportamental.command.create;

import com.fabriciolfj.github.patterns.v2.comportamental.command.model.Pedido;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GerarPedidoHandler {

    private final String cliente;
    private final Orcamento orcamento;

    public void execute() {
        var pedido = new Pedido(this.cliente, LocalDateTime.now(), this.orcamento);
        ExecuteCommands.executeCommands(pedido);
    }
}
