package br.com.sicoob.log.dao;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.mapdb.DB;
import org.mapdb.DB.HashMapMaker;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;


/**
 * Acesso a base de dados.
 * 
 * @author Rogerio Alves Rodrigues
 */
public class LogManagementDao {

    /**
     * Obtem a lista de logs salvos em memoria.
     * 
     * @return Lista de logs.
     * @throws Erro ao acessar o banco em memoria.
     */
    public List listar() throws IOException {
        File dbFile = File.createTempFile("mapdb", "db");
        DB db = DBMaker.fileDB(dbFile).closeOnJvmShutdown().make();
        NavigableSet treeSet = db.treeSet("logs").createOrOpen();
    }

    /**
     * Salva em memoria o item de log.
     * 
     * @param item Log.
     * @throws Erro ao criar o arquivo de log.
     */
    public void salvar(LogItem item) throws IOException {
        File dbFile = File.createTempFile("mapdb", "db");
        DB db = DBMaker.fileDB(dbFile).closeOnJvmShutdown().make();
        NavigableSet treeSet = db.treeSet("logs").createOrOpen();
        treeSet.add(item);
    }

}
