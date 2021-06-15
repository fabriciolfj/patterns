package com.fabriciolfj.github.patterns.v1.estrutural.bridge.implementação;

import com.fabriciolfj.github.patterns.v1.estrutural.bridge.abstracao.Implementacao;

public class ProfessorPosGraduacaoImpl extends Implementacao {

    @Override
    public void operacao() {
        System.out.println("Imprimindo professor pos graduação");
    }
}
