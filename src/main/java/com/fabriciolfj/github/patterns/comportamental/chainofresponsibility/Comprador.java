package com.fabriciolfj.github.patterns.comportamental.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Comprador extends ResponsavelAprovacao {

    public Comprador() {
        this.sucessor = new Gerente();
    }

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor().compareTo(BigDecimal.valueOf(1000)) == -1) {
            log.info("Compra aprovada pelo {}", Comprador.class.getSimpleName());
            return;
        }

        sucessor.aprovar(compra);
    }
}
