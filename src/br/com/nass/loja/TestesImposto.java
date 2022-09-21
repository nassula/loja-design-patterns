package br.com.nass.loja;

import java.math.BigDecimal;

import br.com.nass.loja.imposto.ICMS;
import br.com.nass.loja.imposto.ISS;
import br.com.nass.loja.imposto.Imposto;
import br.com.nass.loja.orcamento.ItemOrcamento;
import br.com.nass.loja.orcamento.Orcamento;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }

}
