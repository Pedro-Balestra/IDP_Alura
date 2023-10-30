package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

    public BigDecimal getValor() {
        return valor;
    }

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal valor;

}
