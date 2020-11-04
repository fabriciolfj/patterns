package com.fabriciolfj.github.patterns.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public abstract class Passagem {

    private String origem;
    private String destino;
    private LocalDateTime horaEmissao;

    abstract void imprimir();
}
