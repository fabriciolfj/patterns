package com.fabriciolfj.github.patterns.v2.comportamental.strategy;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.imposto.CalculadoraDeImpostos;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.imposto.Iss;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Simulacao {

    public static void main(String[] args) {
        final var primeiro = new Orcamento(new BigDecimal("100"), 5);

        final var calculo = new CalculadoraDeImpostos();
        log.info(calculo.calcular(primeiro, new Iss()).toString());
    }
}
