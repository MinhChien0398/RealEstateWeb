package com.nhom44.DAO;

import com.nhom44.bean.Project;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

@RegisterFieldMapper(Project.class)
public interface ProjectDAO {
    @SqlQuery("Select p.id, p.title, p.avatar, p.price, pr.name as province, c.name as category, p.isAccepted," +
            " p.status, p.updatedAt" +
            " FROM projects p LEFT JOIN categories c ON p.categoryId=c.id" +
            " LEFT JOIN provinces pr ON p.provinceId=pr.id")
    List<Project> getAll();

    @SqlUpdate("INSERT INTO projects(title, description, avatar, price, provinceId, isAccepted, postId, categoryId, status)" +
            " VALUES(:title, :description, :avatar, :price, :provinceId, :isAccepted, :postId, :categoryId, :status)")
    int add(@BindBean Project project);

    @SqlQuery("Select p.id, p.title, p.avatar, p.price, pr.name as province, c.name as category, p.isAccepted," +
            " p.status, p.postId, ep.schedule, ep.estimated_complete" +
            " FROM projects p LEFT JOIN categories c ON p.categoryId=c.id" +
            " LEFT JOIN provinces pr ON p.provinceId=pr.id" +
            " LEFT JOIN excuting_projects ep ON p.id=ep.projectId" +
            " WHERE p.id=:id")
    Project getById(@Bind("id") int id);

    @SqlQuery("SELECT COUNT(projectId) From excuting_projects WHERE projectId=:id")
    boolean isFinishProject(@Bind("id") int id);

}