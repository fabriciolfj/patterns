package com.fabriciolfj.github.patterns.v1.criacional.abstractfactory.atualizado;

import com.fabriciolfj.github.patterns.v1.criacional.abstractfactory.PassagemOnibusUrbano;
import com.fabriciolfj.github.patterns.v1.criacional.factorymethod.PassagemOnibusInterestadual;

import java.time.LocalDateTime;

public class EmpresaOnibus {

    public void process(final TipoPassagem tipoPassagem, final String origem, final String destino, final LocalDateTime hora) {
        switch (tipoPassagem) {
            case URBANO:
                emitirPassagemUrbano(origem, destino, hora);
                break;
            case INTERESTADUAL:
                emitirPassagemInterestadual(origem, destino, hora);
                break;
            default:
                throw new RuntimeException("Tipo Passagem invalida");
        }
    }

    private void emitirPassagemInterestadual(String origem, String destino, LocalDateTime hora) {
        var passagem = new PassagemOnibusInterestadual(origem, destino, hora);
        passagem.imprimir();
    }

    private void emitirPassagemUrbano(String origem, String destino, LocalDateTime hora) {
        var passagem = new PassagemOnibusUrbano(origem, destino, hora);
        passagem.imprimir();
    }
}
