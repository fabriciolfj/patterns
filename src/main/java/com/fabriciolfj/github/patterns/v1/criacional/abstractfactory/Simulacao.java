package com.fabriciolfj.github.patterns.v1.criacional.abstractfactory;

import java.time.LocalDateTime;

public class Simulacao {

    public static void main(String[] args) {
        var onibus = new EmpreaOnibus();
        onibus.emitirPassagemInterestadual("SP", "RJ", LocalDateTime.now());
        onibus.emitirPassagemUrbano("MG", "MG", LocalDateTime.now());
    }
}
