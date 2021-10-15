# Design Patterns Course
Solução comum para um problema recorrente ao utilizar
o paradigma da orientação a objetos.    
Livro - Design Patterns Gang of Four  
https://refactoring.guru/design-patterns

## Categorias
1. Criacionais
2. Estruturais
3. Comportamentais
   * Strategy
   * Chain of Responsibility
   * Template Method
   * State
   * Command
   * Observer

## Strategy
* Exemplo: vários tipos de cálculos diferentes para Imposto
cada imposto tem sua lógia, sua estratégia.

## Chain of Responsibility
* Exemplo: Cálculos de diferentes tipos de descontos que devem ser
aplicados a um orçamento um após o outro em cadeia/sequência.
* Exemplo 2: uma cadeia de atendentes, Robo -> AtendenteN1 -> Técnico

## Template Method
* Exemplo: Método concreto na classe mãe, que chama métodos abstratos
implementados nas classes filhas.

## State
* Exemplo: Orcamento pode yer vários estados (Em análise, Aprovado, Reprovado, 
Finalizado). Poder mudar o estado do orçamento de acordo 
com algumas regras, controlar o estado atual bem como o valor de desconto a ser aplicado
de acordo com o estado atual.

## Command
* Exemplo executar vários commandos sequancialmente. Exemplo Gerar Pedido, 
Gravar pedido no banco de dados, Enviar email do pedido

## Observer
* Exemplo: ao gerar um pedido vários passos devem ser executados. 
No metodo que gera o pedido pode-se criar uma List de interessados 
e criar um metodo para adicionar os interessados a observar o evento de geracao do pedido. 
Ao gerar o pedido percorre-se a lista de interessados com cada um executando a sua 
acao desejada.

## Decorator
* Sempre que percebemos que temos comportamentos que podem ser compostos por 
comportamentos de outras classes envolvidas em uma mesma hierarquia, 
como foi o caso dos impostos, que podem ser compostos por outros impostos. 
O Decorator introduz a flexibilidade na composição desses comportamentos, 
bastando escolher no momento da instanciação, quais instancias serão utilizadas 
para realizar o trabalho.

## Builder
* Auxilia a criacao de objetos complexos, exemplo builder para objeto nofa fiscal.
* Facilita criacao de objetos com muitos parametros

## Factory
* Facilita a criacao de objetos complicados, exemplo conexao com banco de dados retornando uma 
Connection
* Centraliza o processo de criacao do objeto

## Flyweight
* Exemplo software tipo guitarpro, em que utiliza notas musicais
* Exemplo objeto nota musical é sempre o mesmo entrao criamos uma estrutura em
que sempre é retornado o mesmo objeto para poupar memoria
* Aplicações gráficas geralmente fazem uso desse padrão, já que elas tem muito objeto repetido.

## Memento
* Exemplo manter historico de alteracoes em um objeto guardar eles e poder voltar a 
um estado especifico do objeto.
* Exemplo alteracoes em um objeto do tipo contrato

## DSLs e o Interpreter
* Exemplo calculadora cientifica
* Arvore de expressao e essa arvore se auto avaliar

## Visitor
* Exemplo imprimir a expressao de uma arvore(expressao)
* Navegar na arvore para fazer algo
* Exemplo Hibernate ao criar as queries

## Bridge e Adapter
* Bridge -> interface unica para poder padronizar chamada a implementacoes diferentes.
* Exemplo Bridge -> formas diferentes de recuperar um mapa (google maps, map link)
* Adapter -> interface que adapta uma interface antiga a uma nova interface
* Adapter -> util quando esta reescrevendo um sistema. Exemplo interface Relogio