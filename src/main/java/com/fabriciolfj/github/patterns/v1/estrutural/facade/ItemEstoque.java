package com.fabriciolfj.github.patterns.v1.estrutural.facade;

import java.util.Objects;

public class ItemEstoque {

    private Produto produto;
    private Integer quantidade;
    private Double valorMedio;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorMedio() {
        return valorMedio;
    }

    public void setValorMedio(Double valorMedio) {
        if (Objects.nonNull(valorMedio) && Objects.nonNull(this.valorMedio)) {
            this.valorMedio = this.valorMedio + valorMedio;
            this.valorMedio = this.valorMedio / this.quantidade;
            return;
        }

        if (Objects.nonNull(valorMedio)) {
            this.valorMedio = valorMedio;
            this.valorMedio = this.valorMedio / this.quantidade;
            return;
        }

        this.valorMedio = 0.0;
    }

    @Override
    public String toString() {
        return "ItemEstoque{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorMedio=" + valorMedio +
                '}';
    }
}
