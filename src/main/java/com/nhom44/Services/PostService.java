package com.nhom44.services;

import com.nhom44.DAO.PostDAO;
import com.nhom44.bean.Post;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.time.LocalDateTime;


public class PostService {
    private Jdbi conn;
    private static PostService instance;

    private PostService() {
        conn = JDBIConnector.get();
    }

    public static PostService getInstance() {
        return instance == null ? (instance = new PostService()) : instance;
    }

    public Post addPost(Post post) {
        post.setCreatedAt(LocalDateTime.now().toString());
        post.setUpdatedAt(LocalDateTime.now().toString());
        int status= conn.withExtension(PostDAO.class, dao -> {
            return dao.addPost(post);

        });
        return status==1?getByObject(post):null;
    }


    public Post getByObject(Post post) {
        return conn.withExtension(PostDAO.class, dao -> dao.getByObject(post));
    }

    public Post updatePost(Post post) {
        post.setUpdatedAt(LocalDateTime.now().toString());
        int status= conn.withExtension(PostDAO.class, dao -> {
            return dao.updatePost(post);

        });
        return status==1?getByObject(post):null;
    }
}
