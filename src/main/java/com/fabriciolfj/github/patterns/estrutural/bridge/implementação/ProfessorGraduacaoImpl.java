package com.fabriciolfj.github.patterns.estrutural.bridge.implementação;

import com.fabriciolfj.github.patterns.estrutural.bridge.abstracao.Implementacao;

public class ProfessorGraduacaoImpl extends Implementacao {

    @Override
    public void operacao() {
        System.out.println("Imprimindo professor graduação");
    }
}
