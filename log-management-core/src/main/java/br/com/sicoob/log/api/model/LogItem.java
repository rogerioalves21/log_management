package br.com.sicoob.log.api.model;

/**
 * Representa um item de log para ser escrito.
 * @author Rogerio Alves Rodrigues
 */
public class LogItem {
  
  private LogType type;
  private String message;
  
  /**
   * Construtor.
   */
  public LogItem() {
    
  }
  
  /**
   * Setter.
   * @param type Tipo da mensagem.
   */
  public void setType(LogType type) {
    this.type = type;
  }
  
  /**
   * Setter.
   * @param message Mensagem.
   */
  public void setMessage(String message) {
    this.message = message;
  }
  
  /**
   * Getter.
   * @return Texto da mensagem.
   */
  public String getMessage() {
    return this.message;
  }
  
  /**
   * Getter.
   * @return Tipo do log.
   */
  public LogType getType() {
    return this.type;
  }
  
}