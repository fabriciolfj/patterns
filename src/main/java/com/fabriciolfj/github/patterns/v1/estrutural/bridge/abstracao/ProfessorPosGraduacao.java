package com.fabriciolfj.github.patterns.v1.estrutural.bridge.abstracao;

import com.fabriciolfj.github.patterns.v1.estrutural.bridge.implementação.ProfessorPosGraduacaoImpl;

public class ProfessorPosGraduacao extends Professor {

    public ProfessorPosGraduacao(ProfessorPosGraduacaoImpl implementacao) {
        super(implementacao);
    }
}
