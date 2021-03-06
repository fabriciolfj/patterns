package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability;

import com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.calculadora.CalculadoraDeDescontos;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Simulacao {

    public static void main(String[] args) {
        final var primeiro = new Orcamento(new BigDecimal("100"), 5);
        final var segundo = new Orcamento(new BigDecimal("100"), 3);

        primeiro.reprovar();
        segundo.aprovar();

        System.out.println("primeiro: " + primeiro.getValor());
        System.out.println("segundo: " + segundo.getValor());
    }
}
