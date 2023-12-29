package com.nhom44.DAO;

import com.nhom44.bean.Category;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Category.class)
public interface CategoryDAO {
    @SqlQuery("SELECT * FROM categories")
    List<Category> getAllCategory();

}
