package com.nhom44.DAO;

import com.nhom44.bean.Project;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
//import org.jdbi.v3.stringtemplate4.UseStringTemplateEngine;

import java.util.List;

@RegisterBeanMapper(Project.class)
public interface ProjectDAO {
    @SqlQuery("Select p.id, p.title, p.avatar, p.price, pr.name as province, c.name as category, p.isAccepted," +
            " p.status, p.updatedAt" +
            " FROM projects p LEFT JOIN categories c ON p.categoryId=c.id" +
            " LEFT JOIN provinces pr ON p.provinceId=pr.id")
    List<Project> getAll();

    @SqlUpdate("INSERT INTO projects(title, description, avatar, price, acreage, provinceId, " +
            "isAccepted, categoryId, status, postId)" +
            " VALUES(:title, :description, :avatar, :price, :acreage, :provinceId, :isAccepted, " +
            ":categoryId, :status,:postId)")
    Integer add(@BindBean Project project);

    @SqlUpdate("UPDATE projects SET title=:title, description=:description, " +
            " price=:price, acreage=:acreage, provinceId=:provinceId, " +
            "isAccepted=:isAccepted, categoryId=:categoryId, status=:status , updatedAt=now() " +
            "WHERE id=:id")
    Integer updateProject(@BindBean Project project);

    @SqlUpdate("UPDATE projects SET avatar=:avatar " +
            "WHERE id=:id")
    Integer updateProjectAvatar(@BindBean Project project);

    @SqlUpdate("INSERT INTO excuting_projects(projectId, schedule, estimated_complete)" +
            " VALUES(:projectId, :schedule, :estimated_complete)")
    int addExcuting(@Bind("projectId") int projectId, @Bind("schedule") String schedule, @Bind("estimated_complete") String estimated_complete);


    @SqlQuery("Select p.id, p.title,p.description, p.avatar, p.price, p.acreage, pr.name as province, c.name as category, p.isAccepted," +
            " p.status, p.postId, ep.schedule, ep.estimated_complete, p.provinceId, p.categoryId" +
            " FROM projects p LEFT JOIN categories c ON p.categoryId=c.id" +
            " LEFT JOIN provinces pr ON p.provinceId=pr.id" +
            " LEFT JOIN excuting_projects ep ON p.id=ep.projectId" +
            " WHERE p.id=:id")
    Project getById(@Bind("id") int id);

    @SqlQuery("SELECT COUNT(projectId) From excuting_projects WHERE projectId=:id")
    boolean isFinishProject(@Bind("id") int id);

    @SqlQuery("Select p.id, p.title,p.description, p.avatar, p.acreage ,p.price, pr.name as province, c.name as category, p.isAccepted," +
            " p.status, p.postId, ep.schedule, ep.estimated_complete, p.categoryId,p.provinceId ,p.updatedAt" +
            " FROM projects p LEFT JOIN categories c ON p.categoryId=c.id" +
            " LEFT JOIN provinces pr ON p.provinceId=pr.id" +
            " LEFT JOIN excuting_projects ep ON p.id=ep.projectId" +
            " WHERE p.title=:title AND p.description=:description  AND p.price=:price AND p.provinceId=:provinceId AND p.isAccepted=:isAccepted AND p.categoryId=:categoryId AND p.status=:status")
    Project getProjectByObject(@BindBean Project project);


    @SqlUpdate("INSERT INTO users_projects(projectId, userId) VALUES(:projectId, :userId)")
    int addProjectForUser(@Bind("projectId") int projectId, @Bind("userId") int userId);

    @SqlUpdate("DELETE FROM excuting_projects WHERE projectId=:id ")
    Integer deleteInExcuting(@Bind("id") int id);

    @SqlUpdate("UPDATE excuting_projects SET schedule=:schedule, estimated_complete=:estimated_complete, updatedAt=now() WHERE projectId=:id")
    int updateExcuting(@BindBean Project project);

    @SqlQuery("SELECT p.id, p.title, p.description, p.avatar, c.name , if(sl.id is null, 0,1 ) " +
            "FROM Projects p " +
            "JOIN Categories c ON c.id = p.categoryId AND c.status = 1 " +
            "JOIN Posts po On po.id =p.postId " +
            "LEFT JOIN saved_projects sl ON sl.postId=po.id " +
            "WHERE  p.status=1 AND p.isAccepted=1 " +
            "AND if(:categoryId <>0 , c.id=:categoryId, c.id=p.categoryId) " +
            "AND if(:provinceId <>0 , p.provinceId=:provinceId, p.provinceId=p.provinceId) " +
            "AND if(:minPrice <>0 ,p.price<=:minPrice,p.price>0) " +
            "AND if(:maxPrice <> 0, p.price>=:maxPrice,p.price>0) " +
            "AND if(:minAcreage <>0 , p.acreage<:minAcreage,p.acreage>=0) " +
            "AND if(:maxAcreage <>0 , p.acreage>:maxAcreage,p.acreage>=0) " +
            "AND p.id IN( " +
            "SELECT ps.projectId " +
            "FROM projects_services ps " +
            "JOIN Services s ON s.id=ps.serviceId AND s.status=1 " +
            "WHERE if(:serviceId>0,s.id=:serviceId,s.id=s.id)) " +
            "order by p.id " +
            "LIMIT 16 OFFSET :offset")
    List<Project> getProjetAllActive(@Bind("offset") int offset, @Bind("categoryId") int categoryId, @Bind("serviceId") int serviceId, @Bind("provinceId") int provinceId, @Bind("minPrice") long minPrice, @Bind("maxPrice") long maxPrice, @Bind("minAcreage") int minAcreage, @Bind("maxAcreage") int maxAcreage);

    @SqlQuery("SELECT p.id, ep.estimated_complete,ep.schedule, ep.updatedAt" +
            " FROM projects p JOIN doanweb.excuting_projects ep on p.id = ep.projectId")
    List<Project> getExcuting();

    @SqlQuery("SELECT p.id, p.title , count(sl.id) as numSave, " +
            "count(h.id) AS numVisit, po.updatedAt AS updatedAt " +
            "FROM Projects p JOIN posts po ON p.postId=po.id " +
            "LEFT JOIN saved_projects sl ON po.id = sl.postId LEFT JOIN " +
            "Histories h ON po.id = h.postId GROUP BY p.id, p.title , po.updatedAt, po.updatedAt"
    )
    List<Project> getNumOfSavedAndRead();
    @SqlQuery("SELECT p.id, p.title, p.description,p.avatar " +
            "FROM Projects p JOIN Categories c ON c.id=p.categoryId " +
            "RIGHT JOIN Histories h ON h.postId=p.postId " +
            "WHERE p.categoryId =:id AND p.isAccepted=1 AND p.status=1 AND c.status = 1 " +
            "GROUP BY p.id, p.title, p.description, p.avatar " +
            "ORDER BY COUNT(p.id) desc LIMIT 8")
    List<Project> get8ActiveProjectHighestView(@Bind("id") int id);

    @SqlUpdate("UPDATE users_projects SET userId=:id1, updatedAt=now() WHERE projectId=:id")
    int updateProjectForUser(@Bind("id") int id, @Bind("id1") int id1);

    @SqlQuery("SELECT count(p.id) " +
            "FROM Projects p " +
            "JOIN Categories c ON c.id = p.categoryId AND c.status = 1 " +
            "JOIN Posts po On po.id =p.postId " +
            "LEFT JOIN saved_projects sl ON sl.postId=po.id " +
            "WHERE  p.status=1 AND p.isAccepted=1 " +
            "AND if(:categoryId <>0 , c.id=:categoryId, c.id=p.categoryId) " +
            "AND if(:provinceId <>0 , p.provinceId=:provinceId, p.provinceId=p.provinceId) " +
            "AND if(:minPrice <>0 ,p.price<=:minPrice,p.price>0) " +
            "AND if(:maxPrice <> 0, p.price>=:maxPrice,p.price>0) " +
            "AND if(:minAcreage <>0 , p.acreage<:minAcreage,p.acreage>0) " +
            "AND if(:maxAcreage <>0 , p.acreage>:maxAcreage,p.acreage>0) " +
            "AND p.id IN( " +
            "SELECT ps.projectId " +
            "FROM projects_services ps " +
            "JOIN Services s ON s.id=ps.serviceId AND s.status=1 " +
            "WHERE if(:serviceId>0,s.id=:serviceId,s.id=s.id)) " +
            "order by p.id ")
    Integer getProjetAllActiveSize(@Bind("offset") int offset, @Bind("categoryId") int categoryId, @Bind("serviceId") int serviceId, @Bind("provinceId") int provinceId, @Bind("minPrice") long minPrice, @Bind("maxPrice") long maxPrice, @Bind("minAcreage") int minAcreage, @Bind("maxAcreage") int maxAcreage);
}