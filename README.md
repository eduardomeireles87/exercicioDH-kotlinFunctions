# exercicioDH-kotlinFunctions


Exercício


Vamos modelar um sistema de caixa de um supermercado:


1) Vamos começar modelando a classe Produto, o produto terá um nome (String) e um preço (Double).
2) Modele a classe CarrinhoDeCompras(), essa classe terá uma lista, do tipo ArrayList<Produto> para itens do tipo Produto.
3) Crie uma função na classe CarrinhoDeCompras() para adicionar produtos na lista.
4) Crie uma classe chamada Caixa().
5) Na classe Caixa() crie uma função chamada fechamentoDeConta(), o fechamento receberá 4 funções como parâmetro.
6) Crie um arquivo chamado Utils (para funções de utilidades genéricas) e as funções dos exercicios que fechamentoDeConta() receberá, você deverá cria-los no arquivo Utils.
7) A primeira função será cabecalhoDoComprovante(), que não receberá parametros e apenas fará a impressão do template abaixo:
##########DH SuperMarket##########
8) A segunda função que fechamentoDeConta() receberá, será a função dataDaCompra(), que também não receberá parametros e retornará a data atual (String) formatada em dia/mes/ano, utilizando a classe Calendar.
9) A terceira função que fechamentoDeConta() receberá, será a função imprimeListaDeCompra, que receberá como parametro a lista de itens e fará a impressão dos mesmos, usando println() para cada item da lista, através do laço de repetição for.
10) E a quarta e última função será a função adicionaRodape(), que receberá a lista de produtos e fará a somatória total, exibindo a ao fim do calculo.
11) Por fim, crie uma função Main() e faça execute seu código ;-) Na função Main, utilize o recurso de parametro nomeado ao chamar as funções, para qualquer programador entender quais parametros estão sendo passados para as funções.
  
  
A impressão deverá ser a seguinte:
  
  
##########DH SuperMarket##########
  
  
Data: dia/mes/ano
  
  
nomeDoItem R$ 00,00
  
  
nomeDoItem R$ 00,00
  
  
nomeDoItem R$ 00,00
  
  
nomeDoItem R$ 00,00
  
  
nomeDoItem R$ 00,00
  
  
nomeDoItem R$ 00,00
  
  
Total: R$ 00,00
