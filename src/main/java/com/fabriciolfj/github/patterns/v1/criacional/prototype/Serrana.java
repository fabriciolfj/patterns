package com.fabriciolfj.github.patterns.v1.criacional.prototype;

public class Serrana extends Municipio {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo cidade: " + Serrana.class.getSimpleName());
    }
}
