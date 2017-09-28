package br.com.sicoob.log.api.service;

import br.com.sicoob.log.api.model.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.moxy.json.MoxyJsonFeature;

/**
 * Implementacao do acesso a api de log.
 * @author Rogerio Alves Rodrigues
 */
public class ServiceApiImpl implements ServiceApi {

    private static final String PROVIDER = "http://localhost:8080/log";
    private static final String PATH     = "api/log";

    /**
     * 
     */
    public void log(LogItem log) {
        Client client = ClientBuilder.newClient();
        client.register(MoxyJsonFeature.class);
        WebTarget target = client.target(PROVIDER).path(PATH);
        target.request().post(Entity.entity(log, MediaType.APPLICATION_JSON_TYPE));
    }

}
