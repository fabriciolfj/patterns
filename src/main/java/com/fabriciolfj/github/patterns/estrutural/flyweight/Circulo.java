package com.fabriciolfj.github.patterns.estrutural.flyweight;

public class Circulo implements Figura {

    private final boolean preenchido;

    public Circulo(final boolean preenchido) {
        this.preenchido = preenchido;
    }

    @Override
    public void desenha(String cor) {
        System.out.println("Figura circulo, cor " + cor + (preenchido ? " preenchido " : " não preenchido" ));
    }
}
