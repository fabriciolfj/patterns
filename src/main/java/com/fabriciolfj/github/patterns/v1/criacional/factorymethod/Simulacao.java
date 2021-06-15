package com.fabriciolfj.github.patterns.v1.criacional.factorymethod;

import java.time.LocalDateTime;

public class Simulacao {

    public static void main(String[] args) {
        var urbano = new EmpreaOnibusUrbano();
        urbano.emitirPassagem("SP", "RJ", LocalDateTime.now());

        var estadual = new EmpresaOnibusInterestadual();
        estadual.emitirPassagem("MG", "BA", LocalDateTime.now());
    }
}
