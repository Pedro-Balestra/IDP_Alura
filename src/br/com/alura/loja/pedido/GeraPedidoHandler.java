package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarpedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias: repository, service, etc.
    private List<AcaoAposGerarpedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarpedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
