package com.fabriciolfj.github.patterns.comportamental.state;

public class Email extends Emissao {

    @Override
    public void exec() {
        System.out.println("Enviando por email");
    }
}
