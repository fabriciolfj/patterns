package com.fabriciolfj.github.patterns.v1.criacional.factorymethod;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Empresa {

    public abstract void emitirPassagem(final String origem, final String destino, final LocalDateTime horaEmissao);

}
