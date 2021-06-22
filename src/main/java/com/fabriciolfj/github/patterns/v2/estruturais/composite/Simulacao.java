package com.fabriciolfj.github.patterns.v2.estruturais.composite;

import com.fabriciolfj.github.patterns.v2.estruturais.proxy.OrcamentoProxy;

import java.math.BigDecimal;

public class Simulacao {

    public static void main(String[] args) {
        var antigo = new Orcamento();
        antigo.addOrcavel(new ItemOrcamento(BigDecimal.valueOf(50l)));

        var orcamento = new Orcamento();
        orcamento.addOrcavel(new ItemOrcamento(BigDecimal.valueOf(120L)));
        orcamento.addOrcavel(antigo);

        var proxy = new OrcamentoProxy(orcamento);
        System.out.println("Total: " + proxy.getValor());
        System.out.println("Total: " + proxy.getValor());
    }
 }
