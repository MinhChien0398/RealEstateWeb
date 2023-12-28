package com.nhom44.DAO;

import com.nhom44.bean.Project;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Project.class)
public interface ProjectDAO {
    @SqlQuery("SELECT * FROM projects where id=:id")
    Project getProjectById(@Bind("id") int id);

    @SqlQuery("SELECT pj.title, pj.description, pj.avatar, pj.price, p.name as provinceName, pj.isAccepted, po.id, c.name as categoryName, pj.status, pj.createdAt, pj.updatedAt as managerProject " +
            "FROM projects pj " +
            "LEFT JOIN provinces p ON pj.provinceId = p.id " +
            "LEFT JOIN posts po ON pj.postId = po.id " +
            "LEFT JOIN categories c ON pj.categoryId = c.id")
    List<Project> getAllProject();

}
