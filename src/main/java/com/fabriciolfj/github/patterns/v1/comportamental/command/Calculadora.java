package com.fabriciolfj.github.patterns.v1.comportamental.command;

public class Calculadora {

    private Long valor;

    public Calculadora(final Long valor) {
        this.valor = valor;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
}
