package com.fabriciolfj.github.patterns.v1.criacional.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Passagem {

    private String origem;
    private String destino;
    private LocalDateTime horaEmissao;

    abstract void imprimir();
}
