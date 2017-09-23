package br.com.sicoob.log.api.service;

import br.com.sicoob.log.api.model.*;

/**
 * Implementacao do acesso a api de log.
 * @author Rogerio Alves Rodrigues
 */
public class ServiceApiImpl implements ServiceApi {
  
  private static final String PROVIDER = "http://localhost:8080/log";
  private static final String PATH = "api/log";
  
  /**
   * 
   */
  public void log(LogItem log) {
    
  }
  
}