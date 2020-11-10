# Padrões de projeto

## Criação
### Factory method
- Defini uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.
- Existe uma fábrica para cada classe concreta.
- Cria 
Exemplo:
```
Possuo a interface Documento e duas classes que a implementam: CPF e CNPJ.
Existe a classe abstrata Pessoa e 2 subclasses, PessoaFisica e PessoaJuridica.
PessoaFisica instancia/fabrica (possui um método) a classe CPF e PessoaJuridica instancia/fabrica a classe CNPJ
```

### Abstract factory
- Fornece uma interface para criação de famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas. 
- A diferença entre o factory method e este, que o factory method possui uma fabrica para cada abstração (fornecendo a classe concreta), aqui, uma facbrica para um conjunto de abstrações, fornecendo a classe concreta conforme critérios.

### Builder
- Separa a construção de um objeto complexo da sua representação de modo que, o mesmo processo de construção possa criar diferentes representações.
- A diferença entre esse padrão com abstract factory, que este cria o objeto passo a passo, enquanto o abstract factory cria o objeto de uma vez.

### Prototype
- Especifica os tipos de objetos a serem criados usando uma instância protótipo e cria novos objetos pela cópia deste protótipo.
- Uma instância inicializada a ser copiada ou clonada ou seja, fazer clones de objetos.
