package com.nhom44.services;

import com.nhom44.DAO.ProjectDAO;
import com.nhom44.DAO.UserDAO;
import com.nhom44.bean.Project;
import com.nhom44.bean.User;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class ProjectService {
    private static ProjectService instance;
    private Jdbi conn;

    private ProjectService() {
        conn = JDBIConnector.get();
    }

    public static ProjectService getInstance() {
        return instance != null ? instance : (instance = new ProjectService());
    }



    public List<Project> getAllProject() {
        return null;
    }
}
