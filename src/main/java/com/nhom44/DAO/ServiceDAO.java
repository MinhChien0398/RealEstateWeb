package com.nhom44.DAO;

import com.nhom44.bean.Service;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Service.class)
public interface ServiceDAO {
    @SqlQuery("SELECT * FROM services")
    List<Service> getAllService();
}
