package com.fabriciolfj.github.patterns.v1.estrutural.bridge.abstracao;

import com.fabriciolfj.github.patterns.v1.estrutural.bridge.implementação.ProfessorGraduacaoImpl;

public class ProfessorGraduacao extends Professor {
    public ProfessorGraduacao(ProfessorGraduacaoImpl implementacao) {
        super(implementacao);
    }
}
