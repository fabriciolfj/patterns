package com.fabriciolfj.github.patterns.abstractfactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Empresa {

    public abstract void emitirPassagemInterestadual(final String origem, final String destino, final LocalDateTime horaEmissao);

    public abstract void emitirPassagemUrbano(final String origem, final String destino, final LocalDateTime horaEmissao);

}
