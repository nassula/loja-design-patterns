package br.com.nass.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.nass.loja.DomainException;
import br.com.nass.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Reprovado());
    }

}
