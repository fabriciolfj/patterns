package com.fabriciolfj.github.patterns.factorymethod;

import java.time.LocalDateTime;

public class EmpresaOnibusInterestadual extends Empresa {

    @Override
    public void emitirPassagem(final String origem, final String destino, final LocalDateTime hora) {
        var passagem = new PassagemOnibusInterestadual(origem, destino, hora);
        passagem.imprimir();
    }
}
