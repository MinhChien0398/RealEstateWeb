package com.nhom44.DAO;

import com.nhom44.bean.Category;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterBeanMapper(Category.class)
public interface CategoryDAO {
    @SqlQuery("SELECT id, name, status, updatedAt FROM categories")
    List<Category> getAll();


}
