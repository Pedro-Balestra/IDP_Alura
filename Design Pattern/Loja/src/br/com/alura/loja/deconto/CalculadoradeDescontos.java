package br.com.alura.loja.deconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoradeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontaParaValoresMaioresQueQuinhentos(new SemDesconto())
        );
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
