package com.fabriciolfj.github.patterns.estrutural.bridge.abstracao;

import com.fabriciolfj.github.patterns.estrutural.bridge.implementação.ProfessorPosGraduacaoImpl;

public class ProfessorPosGraduacao extends Professor {

    public ProfessorPosGraduacao(ProfessorPosGraduacaoImpl implementacao) {
        super(implementacao);
    }
}
