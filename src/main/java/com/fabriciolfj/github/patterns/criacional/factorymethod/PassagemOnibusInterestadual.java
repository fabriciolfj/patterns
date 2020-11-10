package com.fabriciolfj.github.patterns.criacional.factorymethod;


import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class PassagemOnibusInterestadual extends Passagem {

    public PassagemOnibusInterestadual(final String origem, final String destino, final LocalDateTime hora) {
        super(origem, destino, hora);
    }

    @Override
    public void imprimir() {
        log.info("Imprimindo passagem interestadual");
        log.info("Origem: {} Destino: {} Hora: {}", super.getOrigem(), super.getDestino(), super.getHoraEmissao());
    }
}
