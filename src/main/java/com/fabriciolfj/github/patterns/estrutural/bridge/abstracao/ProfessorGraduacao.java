package com.fabriciolfj.github.patterns.estrutural.bridge.abstracao;

import com.fabriciolfj.github.patterns.estrutural.bridge.implementação.ProfessorGraduacaoImpl;

public class ProfessorGraduacao extends Professor {
    public ProfessorGraduacao(ProfessorGraduacaoImpl implementacao) {
        super(implementacao);
    }
}
