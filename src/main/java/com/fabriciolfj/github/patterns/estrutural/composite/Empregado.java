package com.fabriciolfj.github.patterns.estrutural.composite;

import java.math.BigDecimal;

public abstract class Empregado {

    public Empregado(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    private String nome;
    private BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
