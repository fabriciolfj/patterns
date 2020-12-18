package com.fabriciolfj.github.patterns.comportamental.state;

public class Cancelar extends Emissao {
    @Override
    public void exec() {
        System.out.println("Cancelando");
    }
}
