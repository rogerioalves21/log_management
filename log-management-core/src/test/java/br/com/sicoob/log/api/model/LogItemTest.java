package br.com.sicoob.log.api.model;

import org.junit.*;

/**
 * Testes para o log item.
 * @author Rogerio Alves Rodrigues
 */
public class LogItemTest {
  
  /**
   * Testa os atributos.
   */
  @Test
  public void devePreencherLogItem() {
    LogItem log = new LogItem();
    log.setType(LogType.INFO);
    log.setMessage("Mensagem de teste");
    log.setStacktrace("Error");
    
    Assert.assertNotNull(log.getType());
    Assert.assertNotNull(log.getMessage());
    Assert.assertNotNull(log.getStacktrace());
  }
  
}