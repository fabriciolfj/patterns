package com.fabriciolfj.github.patterns.v1.estrutural.flyweight;

public class Linha implements Figura {

    @Override
    public void desenha(final String cor) {
        System.out.println("Figura linha " + cor);
    }
}
