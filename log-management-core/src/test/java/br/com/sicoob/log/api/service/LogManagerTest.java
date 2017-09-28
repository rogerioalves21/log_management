package br.com.sicoob.log.api.service;

import org.junit.Test;

import br.com.sicoob.log.api.model.LogItem;

public class LogManagerTest {
  
  @Test
  public void deveLogarItem() {
    ServiceApi api = new MinhaApi();
    LogManager manager = LogManager.getInstance();
    manager.setApi(api);
    LogManager.getInstance().log(new LogItem());
  }
  
  private class MinhaApi implements ServiceApi {
    
    public void log(LogItem log) {
    }

  }
  
}
