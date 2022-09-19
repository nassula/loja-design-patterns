package br.com.nass.loja.pedido.acoes;

import br.com.nass.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email para cliente sobre pedido...");
    }

}
