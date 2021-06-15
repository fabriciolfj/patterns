package com.fabriciolfj.github.patterns.v1.estrutural.composite;

import java.math.BigDecimal;

public class Simulacao {

    public static void main(String[] args) {
        var empregado1 = new Funcionario("Fabricio", BigDecimal.valueOf(100.00));
        var empregado2 = new Funcionario("Suzana", BigDecimal.valueOf(200.00));
        var empregado3 = new Funcionario("Roberto", BigDecimal.valueOf(900.00));

        var gerente1 = new Gerente("Tarciso", BigDecimal.valueOf(1999));
        var gerente2 = new Gerente("Carlos", BigDecimal.valueOf(2000));
        var gerente3 = new Gerente("Eduardo", BigDecimal.valueOf(9999));

        gerente1.add(empregado1);
        gerente1.add(empregado2);

        gerente2.add(empregado1);
        gerente2.add(empregado3);

        gerente3.add(gerente1);
        gerente3.add(gerente2);

        gerente1.imprimir();
        System.out.println("===============");
        gerente2.imprimir();
        System.out.println("===============");
        gerente3.imprimir();
    }
}
