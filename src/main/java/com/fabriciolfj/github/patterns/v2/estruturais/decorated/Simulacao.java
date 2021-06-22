package com.fabriciolfj.github.patterns.v2.estruturais.decorated;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class Simulacao {

    public static void main(String[] args) {
        var orcamento = new Orcamento(BigDecimal.valueOf(100L), 1);
        var imposto = new Icms(new Iss())
                                .realizarCalculo(orcamento);
        System.out.println("Valor imposto: " + imposto);
    }
}
