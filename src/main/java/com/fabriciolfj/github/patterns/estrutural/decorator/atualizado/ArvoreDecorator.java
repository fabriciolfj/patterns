package com.fabriciolfj.github.patterns.estrutural.decorator.atualizado;

import com.fabriciolfj.github.patterns.estrutural.decorator.Arvore;

import java.util.function.Function;
import java.util.stream.Stream;

public class ArvoreDecorator {

    private Function<Arvore, Arvore> decorator;

    public ArvoreDecorator(Function<Arvore, Arvore>... decorations) {
        reduceDecorations(decorations);
    }

    private void reduceDecorations(Function<Arvore, Arvore>... decorations) {
        decorator = Stream.of(decorations).reduce(f -> f, (x, g) -> x.andThen(g));
    }

    public Arvore decorate(Arvore arvore) {
        return decorator.apply(arvore);
    }
}
