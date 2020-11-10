package com.fabriciolfj.github.patterns.estrutural.bridge;

import com.fabriciolfj.github.patterns.estrutural.bridge.abstracao.ProfessorGraduacao;
import com.fabriciolfj.github.patterns.estrutural.bridge.abstracao.ProfessorPosGraduacao;
import com.fabriciolfj.github.patterns.estrutural.bridge.implementação.ProfessorGraduacaoImpl;
import com.fabriciolfj.github.patterns.estrutural.bridge.implementação.ProfessorPosGraduacaoImpl;

public class Simulacao {

    public static void main(String[] args) {
        var graduacao = new ProfessorGraduacaoImpl();
        var pos = new ProfessorPosGraduacaoImpl();

        var professor = new ProfessorGraduacao(graduacao);
        var professorPos = new ProfessorPosGraduacao(pos);

        professor.execute();
        professorPos.execute();
    }
}
