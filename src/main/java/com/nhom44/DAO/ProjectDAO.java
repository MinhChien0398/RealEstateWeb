package com.nhom44.DAO;

import com.nhom44.bean.Project;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
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
    List<Project> getAllProject();

    @SqlUpdate("INSERT INTO projects(title, description, avatar, price, provinceId, isAccepted, postId, categoryId, status)" +
            " VALUES(:title, :description, :avatar, :price, :provinceId, :isAccepted, :postId, :categoryId, :status)")
    int add(@BindBean Project project);
}
