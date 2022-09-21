package br.com.nass.loja;

import java.math.BigDecimal;

import br.com.nass.loja.orcamento.ItemOrcamento;
import br.com.nass.loja.orcamento.Orcamento;
import br.com.nass.loja.orcamento.OrcamentoProxy;

public class TestesComposite {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }

}
