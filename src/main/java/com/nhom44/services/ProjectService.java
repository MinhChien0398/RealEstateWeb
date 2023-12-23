package com.nhom44.services;

import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

public class ProjectService {
    private static ProjectService instance;
    private Jdbi conn;
    private ProjectService() {
        conn = JDBIConnector.get();
    }
    public static ProjectService getInstance() {
        return instance != null ? instance : (instance = new ProjectService());
    }


}
