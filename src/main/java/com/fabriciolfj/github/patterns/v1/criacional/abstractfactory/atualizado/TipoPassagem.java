package com.fabriciolfj.github.patterns.v1.criacional.abstractfactory.atualizado;

public enum TipoPassagem {
    INTERESTADUAL("interestadual"), URBANO("urbano");

    private String descricao;

    TipoPassagem(final String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
