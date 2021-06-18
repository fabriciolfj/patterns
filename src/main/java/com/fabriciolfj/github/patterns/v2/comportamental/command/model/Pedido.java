package com.fabriciolfj.github.patterns.v2.comportamental.command.model;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
@Getter
public class Pedido {

    private String name;
    private LocalDateTime localDateTime;
    private Orcamento orcamento;
}
