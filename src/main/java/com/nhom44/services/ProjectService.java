package com.nhom44.services;

import com.nhom44.DAO.ProjectDAO;
import com.nhom44.bean.Project;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.JoinRow;

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

    public Project add(Project project, boolean isComplete) {
        int status = Integer.MIN_VALUE;
        if (isComplete) {
            status = conn.withExtension(ProjectDAO.class, dao -> {
                System.out.println("complete dao\n " + project.getDescription());
                return dao.add(project);
            });
        } else {
            int s1 = conn.withExtension(ProjectDAO.class, dao -> {
                System.out.println("dao\n " + project.toString());
                return dao.add(project);
            });
            Project nProject = getProjectByObject(project);
            int s2 = conn.withExtension(ProjectDAO.class, dao -> dao.addExcuting(nProject.getId(), project.getSchedule(), project.getEstimated_complete()));
            status = s1 == 1 && s2 == 1 ? 1 : 0;
        }

        return status == 1 ? getProjectByObject(project) : null;
    }

    public int addExcuting(Project project) {
        if (project.getId() != 0) {
            Project finalProject = project;
            return conn.withExtension(ProjectDAO.class, dao -> dao.addExcuting(finalProject.getId(), finalProject.getSchedule(), finalProject.getEstimated_complete()));
        }
        project = getProjectByObject(project);
        Project finalProject1 = project;
        return conn.withExtension(ProjectDAO.class, dao -> dao.addExcuting(finalProject1.getId(), finalProject1.getSchedule(), finalProject1.getEstimated_complete()));
    }

    public boolean isFinishProject(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.isFinishProject(id));
    }

    public Project getById(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.getById(id));
    }

    public Project getProjectByObject(Project project) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.getProjectByObject(project));
    }

    public Project updateProject(Project project, boolean isComplete) {
        int s1 = Integer.MIN_VALUE;
        int s2 = Integer.MIN_VALUE;
        if (isComplete) {
            conn.withExtension(ProjectDAO.class, dao -> dao.deleteInExcuting(project.getId()));
            conn.withExtension(ProjectDAO.class, dao -> dao.updateProject(project));
        } else {
            conn.withExtension(ProjectDAO.class, dao -> dao.updateExcuting(project));
            conn.withExtension(ProjectDAO.class, dao -> dao.updateProject(project));
        }
        return getProjectByObject(project);
    }

    public int addProjectForUser(int projectId, int userId) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.addProjectForUser(projectId, userId));
    }

    public int deleteInExcuting(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.deleteInExcuting(id));

    }



    public int updateProjectForUser(int id, int id1) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.updateProjectForUser(id, id1));
    }
public List<Project> getNumOfSavedAndRead(){
        return conn.withExtension(ProjectDAO.class, dao -> dao.getNumOfSavedAndRead());
}
    public List<Project> getExcuting() {
        return conn.withExtension(ProjectDAO.class, dao -> dao.getExcuting());
    }
    public static void main(String[] args) {
        List<Project> list = ProjectService.getInstance().getNumOfSavedAndRead();
        for (Project project : list) {
            System.out.println(project.toString());
        }
    }
}
