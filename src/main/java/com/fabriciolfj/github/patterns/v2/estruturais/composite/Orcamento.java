package com.fabriciolfj.github.patterns.v2.estruturais.composite;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
public class Orcamento implements Orcavel {

    private BigDecimal valor = BigDecimal.ZERO;
    private List<Orcavel> orcavels = new ArrayList<>();

    public void addOrcavel(final Orcavel orcavel) {
        orcavels.add(orcavel);
        this.valor = this.valor.add(orcavel.getValor());
    }

    @Override
    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }

        return valor;
    }
}
