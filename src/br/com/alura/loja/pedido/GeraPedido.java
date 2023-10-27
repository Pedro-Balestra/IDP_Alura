package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeDeItens);

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
