package com.fabriciolfj.github.patterns.v1.comportamental.command;

public class Soma implements Command {

    private Calculadora calculadora;
    private Long value;

    public Soma(final Calculadora calculadora, final Long value) {
        this.calculadora = calculadora;
        this.value = value;
    }

    @Override
    public void execute() {
        calculadora.setValor(calculadora.getValor() + value);
        System.out.println("Total: " + calculadora.getValor());
    }

    @Override
    public void roolback() {
        calculadora.setValor(calculadora.getValor() - value);
        System.out.println("Total rollback: " + calculadora.getValor());
    }
}
