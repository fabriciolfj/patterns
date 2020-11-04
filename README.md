# Padrões de projeto

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
