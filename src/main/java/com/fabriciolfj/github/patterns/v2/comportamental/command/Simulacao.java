package com.fabriciolfj.github.patterns.v2.comportamental.command;

import com.fabriciolfj.github.patterns.v2.comportamental.command.create.GerarPedidoHandler;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class Simulacao {

    public static void main(String[] args) {
        var orcamento = new Orcamento(BigDecimal.valueOf(1000L), 8);
        new GerarPedidoHandler("Fabricio", orcamento).execute();
    }
}
