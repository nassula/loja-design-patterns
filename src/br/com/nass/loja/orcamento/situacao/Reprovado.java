package br.com.nass.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.nass.loja.DomainException;
import br.com.nass.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
    }

    @Override
    public void finalizar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Finalizado());
    }

}
