package com.fabriciolfj.github.patterns.v2.comportamental.command.create;

import com.fabriciolfj.github.patterns.v2.comportamental.command.model.Pedido;
import com.fabriciolfj.github.patterns.v2.comportamental.command.observer.EmailService;
import com.fabriciolfj.github.patterns.v2.comportamental.command.observer.EtapasPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.command.observer.LogPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.command.observer.PedidoRepository;

import java.util.List;

public class ExecuteCommands {

    private static List<EtapasPedido> etapas = List.of(new EmailService(), new PedidoRepository(), new LogPedido());

    public static void executeCommands(final Pedido pedido) {
        etapas.forEach(e -> e.execute(pedido));
    }
}
