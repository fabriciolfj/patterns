package com.fabriciolfj.github.patterns.v1.comportamental.templatemethod;

public abstract class Game {

    protected abstract void jogar();

    private void inicio() {
        System.out.println("Inicio de jogo");
    }

    private void fim() {
        System.out.println("Fim de jogo");
    }

    public void executar() {
        inicio();
        jogar();
        fim();
    }
}
