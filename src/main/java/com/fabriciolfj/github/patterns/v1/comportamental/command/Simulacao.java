package com.fabriciolfj.github.patterns.v1.comportamental.command;

public class Simulacao {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(0L);

        Soma soma = new Soma(calculadora, 5L);
        Soma soma2 = new Soma(calculadora, 6L);
        Soma soma3 = new Soma(calculadora, 3L);
        Invoke invoke = new Invoke();
        invoke.compute(soma);
        invoke.compute(soma2);
        invoke.compute(soma3);

        System.out.println("=== rollback ===");
        invoke.undo(2);
    }
}
