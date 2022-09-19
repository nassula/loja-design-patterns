package br.com.nass.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.nass.loja.DomainException;
import br.com.nass.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);

    public void aprovar(Orcamento orcamento) throws DomainException {
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) throws DomainException {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) throws DomainException {
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }

}
