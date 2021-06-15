package com.fabriciolfj.github.patterns.v1.comportamental.state;

public class Email extends Emissao {

    @Override
    public void exec() {
        System.out.println("Enviando por email");
    }
}
