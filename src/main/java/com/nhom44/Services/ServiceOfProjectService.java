package com.nhom44.services;

import com.nhom44.DAO.ServiceDAO;
import com.nhom44.bean.Service;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class ServiceOfProjectService {
    private static Jdbi conn;
    private static ServiceOfProjectService instance;
    private ServiceOfProjectService() {
        conn = JDBIConnector.get();
    }
    public static ServiceOfProjectService getInstance() {
        return instance != null ? instance : (instance = new ServiceOfProjectService());
    }

    public List<Service> getAll() {
        return conn.withExtension(ServiceDAO.class, dao -> dao.getAll());
    }

    public List<Service> getServicesByProjectId(int id) {
        return conn.withExtension(ServiceDAO.class, dao -> dao.getServicesByProjectId(id));
    }

    public static void main(String[] args) {
        List<Service> services = ServiceOfProjectService.getInstance().getServicesByProjectId(1);
        for (Service service : services) {
            System.out.println(service.getName());
        }
    }
}
