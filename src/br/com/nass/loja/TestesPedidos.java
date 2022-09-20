package br.com.nass.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.nass.loja.pedido.GeraPedido;
import br.com.nass.loja.pedido.GeraPedidoHandler;
import br.com.nass.loja.pedido.acoes.CriarPedidoNoBanco;
import br.com.nass.loja.pedido.acoes.EnviarPedidoPorEmail;

//Classe utilizada para testar os pedidos
public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new EnviarPedidoPorEmail(),
                new CriarPedidoNoBanco()));
        handler.executar(gerador);
    }

}
