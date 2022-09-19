package br.com.nass.loja.imposto;

import java.math.BigDecimal;

import br.com.nass.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}
