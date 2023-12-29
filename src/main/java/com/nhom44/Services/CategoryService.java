package com.nhom44.services;

import com.nhom44.DAO.CategoryDAO;
import com.nhom44.DAO.ProjectDAO;
import com.nhom44.bean.Category;
import com.nhom44.bean.Project;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class CategoryService {
    private static CategoryService instance;
    private Jdbi conn;
    private CategoryService() {
    }
    public static CategoryService getInstance() {
        return instance != null ? instance : (instance = new CategoryService());
    }
    public List<Category> getAllCategory() {
        return conn.withExtension(CategoryDAO.class, dao -> dao.getAllCategory());
    }
}
