package com.fabriciolfj.github.patterns.comportamental.mediator;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class AvaliadorCredito {

    private Random random = new Random();

    public void executar(final Pessoa pessoa) {
        if (random.nextInt() % 2 == 0) {
            log.info("Pessoa possui credito");
        }

        log.info("Pessoa não possui crédito");
    }
}
