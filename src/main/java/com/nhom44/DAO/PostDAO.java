package com.nhom44.DAO;


import com.nhom44.bean.Post;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Post.class)
public interface PostDAO {
    @SqlQuery("SELECT * FROM posts")
    List<Post> getAllPost();

}
