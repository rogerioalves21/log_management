package br.com.sicoob.log.config;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Alteracao para o git.2.3.4.5
 * @author rogerioalves21
 */
@ApplicationPath("api")
public class Configuration extends Application {

    /**
     * 
     */
    @Override
    public Set<Class< ? >> getClasses() {
        Set<Class< ? >> classes = new HashSet<Class< ? >>();
        return classes;
    }

}
