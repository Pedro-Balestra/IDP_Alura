# language: pt

Funcionalidade: Propondo lances ao leilao

  Cenario: Propondo um unico lance valido
    Dado um lance valido
    Quando propoe ao leilao
    Entao o lance eh aceito

  Cenario: Propondo varios lances valido
    Dado um lance de 10.0 reais do usuario "fulando"
    E um lance de 15.0 reais do usuario "beltrano"
    Quando propoe varios lances ao leilao
    Entao os lances sao aceitos