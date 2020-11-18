package com.fabriciolfj.github.patterns.comportamental.strategy;

public class Decrescente implements Algoritimo {
    @Override
    public void sort() {
        System.out.println("Ordenando de forma decrescente");
    }
}
