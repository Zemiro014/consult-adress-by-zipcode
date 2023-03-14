# language: pt

  Funcionalidade: Verificacao de frete de cada regiao passando a UF do estado

    Cenario: Valor do frete por Estado
      Dado Que os fretes estao definidas por regioes
      Quando pesquisar o frete de um estado com o seu uf "pb"
      Entao O frete desse estado deve ser calculado
      Quando A uf do Estado for "rs"
      Entao O valor do frete deve ser igual ao valor do frete da regiao sul