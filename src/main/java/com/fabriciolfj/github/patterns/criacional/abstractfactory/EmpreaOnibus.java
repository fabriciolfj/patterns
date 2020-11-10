package com.fabriciolfj.github.patterns.criacional.abstractfactory;

import com.fabriciolfj.github.patterns.criacional.factorymethod.PassagemOnibusInterestadual;

import java.time.LocalDateTime;

public class EmpreaOnibus extends Empresa {

    @Override
    public void emitirPassagemInterestadual(String origem, String destino, LocalDateTime hora) {
        var passagem = new PassagemOnibusInterestadual(origem, destino, hora);
        passagem.imprimir();
    }

    @Override
    public void emitirPassagemUrbano(String origem, String destino, LocalDateTime hora) {
        var passagem = new PassagemOnibusUrbano(origem, destino, hora);
        passagem.imprimir();
    }
}