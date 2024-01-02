package com.nhom44.services;

import com.nhom44.DAO.ProjectDAO;
import com.nhom44.bean.Category;
import com.nhom44.bean.Project;
import com.nhom44.bean.Province;
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
        return conn.withExtension(ProjectDAO.class, dao -> dao.getAll());
    }

    public int add(Project project) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.add(project));
    }

    public boolean isFinishProject(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.isFinishProject(id));
    }
    public Project getById(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> {
            Project project = dao.getById(id);
            return project;
        });
    }

    public static void main(String[] args) {
        Project project = getInstance().getById(1);
        System.out.println(project.toString());
    }
}
