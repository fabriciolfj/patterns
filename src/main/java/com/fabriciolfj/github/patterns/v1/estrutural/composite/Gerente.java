package com.fabriciolfj.github.patterns.v1.estrutural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {

    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public List<Empregado> empregados = new ArrayList<>();

    public void add(final Empregado empregado) {
        empregados.add(empregado);
    }

    public void imprimir() {
        System.out.println("Gerente: " + this.getNome() + ", Salario: " + this.getSalario());
        empregados.stream().forEach(f -> System.out.println("Funcionario: " + f.getNome() + ", Salario: " + f.getSalario()));
    }
}
