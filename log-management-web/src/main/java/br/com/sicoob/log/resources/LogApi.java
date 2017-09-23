package br.com.sicoob.log.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Api para utilizacao.
 * @author Rogerio Alves Rodrigues
 */
@Path("/log")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class LogApi {

    @POST
    public void log() {
      
    }

}
