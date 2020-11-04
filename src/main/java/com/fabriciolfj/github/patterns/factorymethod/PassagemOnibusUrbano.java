package com.fabriciolfj.github.patterns.factorymethod;


import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class PassagemOnibusUrbano extends Passagem {

    public PassagemOnibusUrbano(final String origem, final String destino, final LocalDateTime horaEmissao) {
        super(origem, destino, horaEmissao);
    }

    @Override
    void imprimir() {
        log.info("Imprimindo passagem urbano");
        log.info("Origem: {} Destino: {} Hora: {}", super.getOrigem(), super.getDestino(), super.getHoraEmissao());
    }
}
