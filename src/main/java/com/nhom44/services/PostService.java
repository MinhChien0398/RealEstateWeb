package com.nhom44.services;

import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

public class PostService {
    private Jdbi conn;
    private static PostService instance;

    private PostService() {
        conn = JDBIConnector.get();
    }

    public static PostService getInstance() {
        return instance == null ? (instance = new PostService()) : instance;
    }

}
