package br.com.sicoob.log.excecao;

/**
 * Excecao para o log.
 * 
 * @author Rogerio Alves Rodrigues
 */
public class LogManagementException extends Exception {

    /**
     * Construtor.
     * @param mensagem Mensagem de erro.
     * @param excecao Stack do erro.
     */
    public LogManagementException(String mensagem, Throwable excecao) {
        super(mensagem, excecao);
    }

}
