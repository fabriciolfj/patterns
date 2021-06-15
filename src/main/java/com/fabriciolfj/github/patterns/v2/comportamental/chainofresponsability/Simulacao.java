package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability;

import com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.calculadora.CalculadoraDeDescontos;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Simulacao {

    public static void main(String[] args) {
        final var primeiro = new Orcamento(new BigDecimal("100"), 5);
        final var segundo = new Orcamento(new BigDecimal("2000"), 3);
        final var calculadora = new CalculadoraDeDescontos();

        System.out.println("primeiro: " + calculadora.calcular(primeiro));
        System.out.println("segundo: " + calculadora.calcular(segundo));

        /*final var calculo = new CalculadoraDeImpostos();
        log.info(calculo.calcular(orcamento, new Iss()).toString());*/
    }
}
