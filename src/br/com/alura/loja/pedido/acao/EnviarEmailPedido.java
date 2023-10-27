package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarpedido {
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no Banco de Dados");
    }
}
