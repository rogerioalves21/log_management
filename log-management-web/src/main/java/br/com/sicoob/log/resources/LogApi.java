package br.com.sicoob.log.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sicoob.log.api.model.LogItem;
import br.com.sicoob.log.excecao.LogManagementException;
import br.com.sicoob.log.facade.LogManagementFacade;

/**
 * Api para utilizacao.
 * 
 * @author Rogerio Alves Rodrigues
 */
public class LogApi {

    @Inject
    private LogManagementFacade facade;

    /**
     * Salva um item de log.
     * 
     * @param item Log item.
     */
    @POST
    @Path("/log")
    @Consumes({MediaType.APPLICATION_JSON})
    public void log(LogItem item) {
        try {
            facade.salvar(item);
        } catch (LogManagementException excecao) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao salvar um item");
        }
    }
   
    @GET
    @Path("/ola")
    @Produces({MediaType.TEXT_PLAIN})
    public String olaMundo() {
      return "Ola Mundo Jersey";
    }

}
