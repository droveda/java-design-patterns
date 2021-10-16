# Design Patterns Course

Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos.    
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

* Exemplo: vários tipos de cálculos diferentes para Imposto cada imposto tem sua lógia, sua estratégia.

## Chain of Responsibility

* Exemplo: Cálculos de diferentes tipos de descontos que devem ser aplicados a um orçamento um após o outro em
  cadeia/sequência.
* Exemplo 2: uma cadeia de atendentes, Robo -> AtendenteN1 -> Técnico

## Template Method

* Exemplo: Método concreto na classe mãe, que chama métodos abstratos implementados nas classes filhas.

## State

* Exemplo: Orcamento pode yer vários estados (Em análise, Aprovado, Reprovado, Finalizado). Poder mudar o estado do
  orçamento de acordo com algumas regras, controlar o estado atual bem como o valor de desconto a ser aplicado de acordo
  com o estado atual.

## Command

* Exemplo executar vários commandos sequancialmente. Exemplo Gerar Pedido, Gravar pedido no banco de dados, Enviar email
  do pedido

## Observer

* Exemplo: ao gerar um pedido vários passos devem ser executados. No metodo que gera o pedido pode-se criar uma List de
  interessados e criar um metodo para adicionar os interessados a observar o evento de geracao do pedido. Ao gerar o
  pedido percorre-se a lista de interessados com cada um executando a sua acao desejada.

## Decorator

* Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas
  em uma mesma hierarquia, como foi o caso dos impostos, que podem ser compostos por outros impostos. O Decorator
  introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais
  instancias serão utilizadas para realizar o trabalho.

## Builder

* Auxilia a criacao de objetos complexos, exemplo builder para objeto nofa fiscal.
* Facilita criacao de objetos com muitos parametros

## Factory

* Facilita a criacao de objetos complicados, exemplo conexao com banco de dados retornando uma Connection
* Centraliza o processo de criacao do objeto

## Flyweight

* Exemplo software tipo guitarpro, em que utiliza notas musicais
* Exemplo objeto nota musical é sempre o mesmo entrao criamos uma estrutura em que sempre é retornado o mesmo objeto
  para poupar memoria
* Aplicações gráficas geralmente fazem uso desse padrão, já que elas tem muito objeto repetido.

## Memento

* Exemplo manter historico de alteracoes em um objeto guardar eles e poder voltar a um estado especifico do objeto.
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

## Facade

* Interface única para simplificar várias chamadas a métodos e classes diferentes em uma única interface.

## Singleton

* Retorna apenas uma única instancia de uma classe.

# SOLID com Java

* SRP - Single Responsibility Principle (Coesão)
* Open Closed Principle
* Liskov Substitutive Principle
* Dependency Inversion Principles

## Coesão e Single Responsibility Principle

* Todas as classes devem ser muito coesas
* Uma classe coesa é aquela que contém apenas uma única responsabilidade. Ou seja, ela toma conta de apenas um conceito
  dentro do sistema.
* Classes coesas tendem a ser menores, e por consequência, mais fáceis de serem lidas e mantidas. Elas também tendem a
  ser mais reutilizáveis, afinal são mais fáceis.

## Acoplamento

* Tenha classes que são muito coesas e pouco acopladas
* Se acoplar a Interfaces Estáveis (que tendam a mudar muito pouco)
* Classes estáveis são aquelas que tendem a mudar muito pouco. A vantagem de classes como essas é que são ótimas classes
  para se depender, já que elas não propagarão mudança para as classes dependentes.
* Classes estáveis são aquelas que geralmente já são dependidas por muitas outras classes do sistema. Um bom exemplo
  disso são interfaces, pois elas geralmente possuem muitas implementações, e aí isso faz com que o desenvolvedor pense
  melhor antes de sair mudando a interface.
* A ideia é refatorar as classes para elas, quando necessitem de uma dependência, dependam de classes estáveis. Assim, a
  classe estará segura em relação a propagação de mudanças. É por isso que falamos muito sobre a ideia de "programar
  para interfaces", afinal, interfaces, além de nos possibilitar o uso de polimorfismo, ainda são estáveis.

## Open Closed Principle and Dependency Inversion Principles

* Classes abertas e OCP (Copen Closed Principle)
* Abertas para extensão e fechada para alteração
* DIP (Dependency Inversion Principle) Dependa sempre de abstrações
* DIP é diferente de Injeção de Dependencias
* O OCP diz para escrevermos classes que sejam facilmente extensíveis (ou seja, abertas pra extensão). Dessa forma,
  mudar o comportamento da classe atual é fácil: basta passar outras implementações concretas das abstrações que ela
  depende.
* Classes abertas para extensão, mas fechadas para modificação, também são mais coesas.
* O DIP nos diz para sempre dependermos de módulos que sejam mais estáveis que o módulo corrente. Abstrações devem
  depender de abstrações, e implementação deve depender de abstração.
  *Com isso, diminuímos o risco do acoplamento, afinal abstrações são estáveis, e tendem a não mudar frequentemente,
  diminuindo a propagação de problemas.

## Encapsulamento

* Encapsular = esconder a implementacao
* Intimidade inapropriada
* Tell, Don't ask
* 2 Peruntas
    * O que o metodo faz?
    * Como ele faz isso? (Se ele esconde como faz está OK)
* Exemplo classes DAOs
* Ajuda a aliviar a propagação de mudanças
    * fatura.getCliente().marcaComoInadimplente(); (Errado)
    * fatura.marcaClienteComoInadimplente(); (OK)
* Lei de Demeter (Evite ao máximo fazer invocações em cadeia)
* Cuidado com setters
* Encapsular é esconder os detalhes da implementação dentro da classe. Dessa forma, as classes que farão uso dela, não
  saberão como ela funciona internamente. A vantagem disso é que conseguimos depois facilmente alterar a implementação,
  sem que ela impacte nas classes dependentes.
* A Lei de Demeter, de maneira simples, diz para que você evite ao máximo fazer expressões como a.getB().getC().getD()
  .acao(). O problema dessa cadeia, é que a classe que contém essa expressão, conhece muito sobre o comportamento da
  classe A, depois da classe B, até D. Se alguma delas mudar, a mudança será propagada para muitos lugares.
* Diminuir a quantidade de invocações como essas ajuda você a encapsular melhor o comportamento e o funcionamento
  interno das classes.

## Herança, Composição e Liskov

* Herança e o Liskov Substitutive Principle
* Liskov
    * Pensar muito bem nas pre-condicoes e nas pos-condicoes (entrada e saida)
    * Exemplo Classe Retangulo e Classe Quadrado na qual Quadrado extends Retangulo
        * retangulo lados nao tem pre-condicoes
        * no quadrado todos os lados sao iguais
        * Pré-condições não podem ser mais restritas que a da classe pai, a classe filha só pode afrouxar a pré-condição
        * Pós-condições não podem ser menos restritas que a da classe pai
            * Exemplo:
                * método que devolve inteiro de 1 a 100
                * classe filha sobrescreve o método e devolve inteiro de 1 a 200
                * Isso pode quebrar as classes clientes
* Favoreça a Composição
* Porque para se fazer bom uso de herança, o desenvolvedor deve pensar em cada método que a classe filha herdou e
  sobrescreveu, e lembrar que as pré-condições não podem ser apertadas, e as pós-condições não podem serem afrouxadas.
* Isso não é tão simples, e requer muito raciocínio do desenvolvedor, sempre que for reescrever um comportamento.
* Você pode fazer uso de composição para reaproveitar comportamentos. Diferente da herança, ao compor um objeto, você
  não precisa se preocupar com as pré e pós condições.
  *No entanto, ao fazer uso de herança, você ganha o uso de polimorfismo. Quando bem usada, a herança também é uma
  excelente opção.
* http://en.wikipedia.org/wiki/Liskov_substitution_principle
