package br.com.sicoob.log.dao;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;

import org.mapdb.DB;
import org.mapdb.DB.HashMapMaker;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;

import br.com.sicoob.log.api.model.LogItem;

/**
 * Acesso a base de dados.
 * 
 * @author Rogerio Alves Rodrigues
 */
public class LogManagementDao {

    /**
     * Salva em memoria o item de log.
     * 
     * @param item Log.
     * @throws Erro ao salvar o item.
     * @throws Erro ao criar o arquivo de log.
     */
    public void salvar(LogItem item) throws IOException {
        File dbFile = File.createTempFile("mapdb", "db");
        DB db = DBMaker.fileDB(dbFile).closeOnJvmShutdown().make();

        NavigableSet treeSet = db.treeSet("example").createOrOpen();
        treeSet.add(item);
    }

}
