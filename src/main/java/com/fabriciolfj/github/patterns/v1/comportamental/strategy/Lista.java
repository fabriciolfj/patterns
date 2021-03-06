package com.fabriciolfj.github.patterns.v1.comportamental.strategy;

public class Lista {

    private Algoritimo algoritimo;

    public Lista(final Algoritimo algoritimo) {
        this.algoritimo = algoritimo;
    }

    public void setAlgoritimo(final Algoritimo algoritimo) {
        this.algoritimo = algoritimo;
    }

    public void execute() {
        this.algoritimo.sort();
    }
}
