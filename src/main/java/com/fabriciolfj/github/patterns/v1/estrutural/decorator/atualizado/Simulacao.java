package com.fabriciolfj.github.patterns.v1.estrutural.decorator.atualizado;

import com.fabriciolfj.github.patterns.v1.estrutural.decorator.*;

import java.util.function.Function;

public class Simulacao {

    public static void main(String[] args) {
        Function<Arvore, Arvore> bola = x -> new Bola(x);
        ArvoreDecorator decorator = new ArvoreDecorator(bola, Estrela::new, PiscaPisca::new);

        Arvore arvore = decorator.decorate(new ArvoreNatal());

        arvore.showEnfeites();
    }
}
