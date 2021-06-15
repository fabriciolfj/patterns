package com.fabriciolfj.github.patterns.v1.estrutural.facade;

public class Simulacao {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setCodigo(1L);
        produto.setNome("Arroz");
        produto.setValor(100.00);


        Produto produto2 = new Produto();
        produto2.setCodigo(1L);
        produto2.setNome("Arroz");
        produto2.setValor(50.00);

        Produto produto3 = new Produto();
        produto3.setCodigo(2L);
        produto3.setNome("Feijao");
        produto3.setValor(99.00);

        FacadeEstoque facade = new FacadeEstoque();
        facade.adicionar(produto);
        facade.adicionar(produto2);
        facade.adicionar(produto3);

        System.out.println(facade.consulta(produto));
    }
}
