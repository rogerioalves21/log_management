package br.com.sicoob.log.facade;

import java.io.IOException;

import javax.inject.Inject;

import br.com.sicoob.log.api.model.LogItem;
import br.com.sicoob.log.dao.LogManagementDao;
import br.com.sicoob.log.excecao.LogManagementException;

/**
 * Classe responsavel por disponibilizar servicos para salvar e obter logs.
 * 
 * @author Rogerio Alves Rodrigues
 */
public class LogManagementFacade {

    @Inject
    private LogManagementDao dao;

    /**
     * Salva em memoria o item de log.
     * 
     * @param item Log.
     * @throws Erro ao salvar o item.
     */
    public void salvar(LogItem item) throws LogManagementException {
        try {
            this.dao.salvar(item);
        } catch (IOException excecao) {
            throw new LogManagementException("Erro ao salvar", excecao);
        }
    }

}
