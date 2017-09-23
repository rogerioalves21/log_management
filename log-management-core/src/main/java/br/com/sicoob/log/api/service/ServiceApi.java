package br.com.sicoob.log.api.service;

import br.com.sicoob.log.api.model.*;

/**
 * Servicos do log.
 * @author Rogerio Alves Rodrigues
 */
public interface ServiceApi {
  
  /**
   * Realiza a inclusao de um log.
   * @param log Dados do log.
   */
  void log(LogItem log);
  
}