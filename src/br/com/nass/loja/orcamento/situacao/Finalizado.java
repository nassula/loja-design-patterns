package br.com.nass.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.nass.loja.DomainException;
import br.com.nass.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }

}
