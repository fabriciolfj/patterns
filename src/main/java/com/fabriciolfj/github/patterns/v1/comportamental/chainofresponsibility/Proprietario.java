package com.fabriciolfj.github.patterns.v1.comportamental.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Proprietario extends ResponsavelAprovacao {

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor().compareTo(BigDecimal.valueOf(10000)) == -1) {
            log.info("Compra aprovada pelo {}", Proprietario.class.getSimpleName());
            return;
        }

        log.info("Compra não aprovada");
     }
}
