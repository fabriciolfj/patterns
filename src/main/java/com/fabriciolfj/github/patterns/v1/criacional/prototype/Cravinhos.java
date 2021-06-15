package com.fabriciolfj.github.patterns.v1.criacional.prototype;

public class Cravinhos extends Municipio {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo cidade: " + Cravinhos.class.getSimpleName());
    }
}
