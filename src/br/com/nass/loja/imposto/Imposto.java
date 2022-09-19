package br.com.nass.loja.imposto;

import java.math.BigDecimal;

import br.com.nass.loja.orcamento.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
