package com.fabriciolfj.github.patterns.v1.comportamental.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Gerente extends ResponsavelAprovacao {

    public Gerente() {
        this.sucessor = new Proprietario();
    }

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor().compareTo(BigDecimal.valueOf(5000)) == -1) {
            log.info("Compra aprovada pelo {}", Gerente.class.getSimpleName());
            return;
        }

        sucessor.aprovar(compra);
    }
}
