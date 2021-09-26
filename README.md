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

