package com.fabriciolfj.github.patterns.v2.comportamental.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Orcamento {

    private BigDecimal valor;
    private Integer qtde;
}
