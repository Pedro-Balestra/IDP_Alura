package br.com.alura.loja.deconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoradeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontaParaValoresMaioresQueQuinhentos(new SemDesconto())
        );
        return desconto.calcular(orcamento);
    }
}
