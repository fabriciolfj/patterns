package com.fabriciolfj.github.patterns.estrutural.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeEstoque {

    private List<ItemEstoque> estoques = new ArrayList<>();

    public void adicionar(Produto produto) {
        estoques.stream().filter(p -> {
            System.out.println("Produto da lista: " + p.toString());
            System.out.println("Produto parâmetro: " + produto.toString());
            return p.getProduto().getCodigo().equals(produto.getCodigo());
        }).map(p -> {
                    p.setQuantidade(p.getQuantidade() + 1);
                    p.setValorMedio(produto.getValor());
                    return p;
                }).findFirst()
                .orElseGet(() -> {
                    var estoque = new ItemEstoque();
                    estoque.setQuantidade(1);
                    estoque.setValorMedio(produto.getValor());
                    estoque.setProduto(produto);
                    estoques.add(estoque);
                    return estoque;
                });
    }

    public ItemEstoque consulta(Produto produto) {
        return estoques.stream().filter(p -> p.getProduto().getCodigo().equals(produto.getCodigo()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Produto não localizado"));
    }
}
