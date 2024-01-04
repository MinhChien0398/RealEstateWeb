package com.nhom44.DAO;

import com.nhom44.bean.Service;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

@RegisterBeanMapper(Service.class)
public interface ServiceDAO {
    //get all service
    @SqlQuery("SELECT id, name, status FROM services")
    List<Service> getAll();
    @SqlQuery("SELECT s.id, s.name, s.status FROM services s JOIN projects_services sp ON s.id=sp.serviceId AND sp.projectId=:id")
    List<Service> getServicesByProjectId(@Bind("id") int id);
    @SqlUpdate("INSERT INTO projects_services(projectId, serviceId) VALUES(:projectId, :serviceId)")
    Integer addServiceForProject(@Bind("projectId") int projectId,@Bind("serviceId") int serviceId);
}
