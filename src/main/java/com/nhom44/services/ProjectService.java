package com.nhom44.services;

import com.nhom44.DAO.ProjectDAO;
import com.nhom44.DAO.ServiceDAO;
import com.nhom44.bean.Project;
import com.nhom44.bean.Service;
import com.nhom44.db.JDBIConnector;
import com.nhom44.util.SearcherProjectUtil;
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

    public Project updateProjectAvatar(Project project) {
        conn.withExtension(ProjectDAO.class, dao -> dao.updateProjectAvatar(project));
        return getById(project.getId());
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

    public List<Project> getNumOfSavedAndRead() {
        return conn.withExtension(ProjectDAO.class, dao -> {
            List<Project> res = dao.getNumOfSaved();
            List<Project> read = dao.getNumOfRead();
            for (int i = 0; i < res.size(); i++) {
                res.get(i).setNumVisit(read.get(i).getNumVisit());
            }
            return res;
        });
    }

    public List<Project> getExcuting() {
        return conn.withExtension(ProjectDAO.class, dao -> dao.getExcuting());
    }

    public List<Project> getProjetAllActive(int offset, int categoryId, int serviceId, int provinceId, long minPrice, long maxPrice, int minAcreage, int maxAcreage, int userid) {
        return conn.withExtension(ProjectDAO.class, dao -> {
            System.out.println("userid "+userid);
            List<Project> res = dao.getProjetAllActive(offset, categoryId, serviceId, provinceId, minPrice, maxPrice, minAcreage, maxAcreage, userid);
            for (Project project : res) {
                System.out.println(project.toString());
            }
            for (Project p : res) {
                if (p.getSaveBy() == userid && p.getSaveBy() !=0) p.setSave(true);
            }
//            res.forEach(p -> {
//                if (p.getSaveBy() == userid) p.setSave(true);
//            });
            for (Project project : res) {
                System.out.println(project.toString());
            }
            return res;
        });
    }

    public static void main(String[] args) {
//        List<Project> projects = getInstance().getProjetForPreview();
//        for (Project project : projects) {
//            System.out.println(project);
//        }
        List<Project> projects = getInstance().getProjetAllActive(0, 0, 0, 0, 0, 0, 0, 0, 24);
        System.out.println(projects.size());
        for (Project project : projects) {
            System.out.println(project);
        }
    }

    public List<Project> get8ActiveProjectHighestView(int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.get8ActiveProjectHighestView(id));
    }

    public int getProjetAllActiveSize(int offset, int categoryId, int serviceId, int provinceId, long minPrice, long maxPrice, int minArea, int maxArea) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.getProjetAllActiveSize(offset, categoryId, serviceId, provinceId, minPrice, maxPrice, minArea, maxArea));
    }

    public boolean saveProject(int projectId, int userId) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.saveProject(projectId,userId));
    }

    public boolean deleteSaveProject(int projectId, int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.deleteSaveProject(projectId,id));
    }

    public boolean isSaveProject(int projectId, int id) {
        return conn.withExtension(ProjectDAO.class, dao -> dao.isSaveProject(projectId,id));
    }
}
