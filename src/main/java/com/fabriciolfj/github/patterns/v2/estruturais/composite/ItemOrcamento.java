package com.fabriciolfj.github.patterns.v2.estruturais.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItemOrcamento implements Orcavel {

    private BigDecimal valor;
}
