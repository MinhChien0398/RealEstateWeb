package com.nhom44.DAO;

import com.nhom44.bean.Service;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Service.class)
public interface ServiceDAO {
    //get all service
    @SqlQuery("SELECT id, name, status FROM services")
    List<Service> getAll();
    @SqlQuery("SELECT s.id, s.name, s.status FROM services s JOIN projects_services sp ON s.id=sp.serviceId AND sp.projectId=:id")
    List<Service> getServicesByProjectId(@Bind("id") int id);
}
