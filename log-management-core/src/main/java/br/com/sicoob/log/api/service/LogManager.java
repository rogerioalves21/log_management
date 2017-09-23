package br.com.sicoob.log.api.service;

import br.com.sicoob.log.api.model.LogItem;

/**
 * Classe para chamar o log.
 * @author Rogerio Alves Rodrigues
 */
public final class LogManager {

    private static final LogManager INSTANCE = new LogManager();

    /**
     * Construtor privado.
     */
    private LogManager() {

    }

    private ServiceApi api;

    protected void setApi(ServiceApi api) {
        this.api = api;
    }

    /**
     * Obtem a instancia de LogManager.
     */
    public static LogManager getInstance() {
        return INSTANCE;
    }

    /**
     * Realiza o log da mensagem.
     * @param item Log.
     */
    public void log(LogItem item) {
        if (this.api == null) {
            this.api = new ServiceApiImpl();
        }
        this.api.log(item);
    }

}
