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
- Ideal para contextos onde os objetos não sofrem tanta alteração, como municipios, formulas matemáticas, pois com advento do clone pode aumentar significativamente  o uso da memória.

## Estruturais
- Eles se preocupam com a composição das classes e seus objetos.
- O conceito de herança e largamente utilizado.

### Bridge
- Desacopla uma abstração da sua implementação, de modo que as duas possam varial independentemente.
- Separa o objeto da sua implementação.

### Adapter
- Permite que interfaces incompativéis trabalhem em conjunto.
- converte uma interface de uma classe em outra interface, esperada pelos clientes.
- Basicamente extendemos a classe que queiramos adaptar (mudar o comportamento), e realizamos o override no método correspondente.
- Equivale ao padrão bridge, mas realizando uma ponto com interfaces incompatíveis.

### Proxy
- fornece um marcado de localização de outro objeto para controlar o acesso ao mesmo.
- basicamente ele controla o acesso a um objeto (um if apenas).

### Decorator
- Agregar dinamicamente responsabilidades a um objeto.
- Basicamente você possui um objeto base, e um objeto que vai inserido outros (decorações) em uma pilha.

### Composite
- Compõe objetos em estruturas de árvore.

### Facade
- Fornece uma interface unificada para um conjunto de interfaces em um sistema. O facade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.
- Basicamente é uma faxada onde esta, chamada diversos processos para concluir um fluxo por exemplo.

### Flyweight
- Manipular grande quantidade de objetos em memória, partindo do princípio que é um recurso escasso.

## Comportamental
- Relacionados a comunicação entre objetos

### Commands
- Encapsular comandos em um objeto, ou seja, executa várias ações em um objeto e cada ação é representada por um objeto ou também utilizado para desfazer várias ações em um objeto. Exemplo: uma nota fiscal ao ser emitida, precisa: mandar para a sefaz, imprimir a danfe, atualizaro pedido, debitar o estoque.

### Strategy
- Permie que algoritimos varie independente do cliente que esteja utilizando.

### State
- Permite alterar o comportamento do objeto, com seu estado interno muda.
- Basicamente cria-se um objeto para cada estado, que o objeto possui.

### Observer
- Cria uma dependência de uma para muitos entre objetos, de uma maneira quando um muda seu estado, ele notifica os demais. (relação do observado e observadores)

### Mediator
- encapsula a forma como um conjunto de objetos interage, promovendo o baixo acoplamento, evitando que os objetos se refiram uns aos outros explicitamente.

### Chain of responsibility
- Uma maneira de passar uma requisição entre uma cadeia de objetos.

### Template Method
- Define um esqueleto de um algoritimo em uma operação, postergando alguns passos para subclasses. 
- Permite que subclasses redefinam comportamento de certos passos, sem mudar a estrutura.

### Interpreter
- Interpreta uma expressão, ou utiliza as classes para representar uma regra de alguma gramática.
- Basicamente teremos uma classe abstrata com algumas regras genericas e metodos abstratos, de onde viram as representações específicas.

### Memento
- Salvar o estado de um objeto, sem quebrar o encapsulamento, e recuperar esse estado posteriormente.
