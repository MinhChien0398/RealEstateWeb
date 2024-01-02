package com.nhom44.services;

import com.nhom44.DAO.CategoryDAO;
import com.nhom44.bean.Category;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class CategoryService {
    private static Jdbi conn;
    private static CategoryService instance;
    private CategoryService() {
        conn = JDBIConnector.get();
    }
    public static CategoryService getInstance() {
        return instance != null ? instance : (instance = new CategoryService());
    }
    public List<Category> getAll() {
        return conn.withExtension(CategoryDAO.class, dao -> dao.getAll());
    }
}
