package com.nhom44.services;

import com.nhom44.DAO.PostDAO;
import com.nhom44.DAO.ProjectDAO;
import com.nhom44.bean.Post;
import com.nhom44.bean.Project;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class PostService {
    private static PostService instance;
    private Jdbi conn;
    private PostService() {
        conn = JDBIConnector.get();
    }
    public static PostService getInstance() {
        return instance != null ? instance : (instance = new PostService());
    }
    public List<Post> getAllPost() {
        return conn.withExtension(PostDAO.class, dao -> dao.getAllPost());
    }
}
