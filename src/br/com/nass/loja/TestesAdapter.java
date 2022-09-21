package br.com.nass.loja;

import java.math.BigDecimal;

import br.com.nass.loja.http.ApacheHttpAdapter;
import br.com.nass.loja.orcamento.ItemOrcamento;
import br.com.nass.loja.orcamento.Orcamento;
import br.com.nass.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
        registro.registrar(orcamento);
    }

}
