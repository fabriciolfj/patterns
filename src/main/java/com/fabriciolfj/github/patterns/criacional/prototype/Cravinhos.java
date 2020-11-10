package com.fabriciolfj.github.patterns.criacional.prototype;

public class Cravinhos extends Municipio {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo cidade: " + Cravinhos.class.getSimpleName());
    }
}
