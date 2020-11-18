package com.fabriciolfj.github.patterns.comportamental.command;

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
