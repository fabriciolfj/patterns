package com.fabriciolfj.github.patterns.v1.comportamental.mediator;

public class Main {

    public static void main(String[] args) {
        var mediator = new MediatorImpl();

        mediator.registrarPessoa(new Pessoa("Fabricio", "339"));
        mediator.registrarPessoa(new Pessoa("Suzana", "223"));
        mediator.registrarPessoa(new Pessoa("Carlos", "442"));
        mediator.registrarPessoa(new Pessoa("Erica", "23232"));

        mediator.avaliar();
    }
}
