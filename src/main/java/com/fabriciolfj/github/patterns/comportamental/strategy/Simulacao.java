package com.fabriciolfj.github.patterns.comportamental.strategy;

public class Simulacao {

    public static void main(String[] args) {
        Lista lista = new Lista(new Crescente());
        lista.execute();

        lista.setAlgoritimo(new Decrescente());
        lista.execute();
    }
}
