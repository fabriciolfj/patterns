package com.fabriciolfj.github.patterns.v1.comportamental.state;

public class Cancelar extends Emissao {
    @Override
    public void exec() {
        System.out.println("Cancelando");
    }
}
