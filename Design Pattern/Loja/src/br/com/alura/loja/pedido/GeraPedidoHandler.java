package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarpedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias: repository, service, etc.
    private List<AcaoAposGerarpedido> acoesAposGerarPedido;

    public GeraPedidoHandler(List<AcaoAposGerarpedido> acoesAposGerarPedidos) {
        acoesAposGerarPedido = acoesAposGerarPedidos;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));

    }
}
