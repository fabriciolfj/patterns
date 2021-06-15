package com.fabriciolfj.github.patterns.v1.criacional.factorymethod;

import java.time.LocalDateTime;

public class EmpreaOnibusUrbano extends Empresa {

    @Override
    public void emitirPassagem(final String origem, final String destino, final LocalDateTime hora) {
        var passagem = new PassagemOnibusUrbano(origem, destino, hora);
        passagem.imprimir();
    }
}
