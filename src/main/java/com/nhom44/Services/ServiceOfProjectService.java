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
    public int addServiceForProject(int projectId, int serviceId) {
        return conn.withExtension(ServiceDAO.class, dao -> dao.addServiceForProject(projectId, serviceId));
    }
    public List<Service> getServicesByProjectId(int id) {
        return conn.withExtension(ServiceDAO.class, dao -> dao.getServicesByProjectId(id));
    }

    public static void main(String[] args) {
        List<Service> services = getInstance().getAll();
        System.out.println(services.size());
        for (Service service : services
             ) {
            System.out.println(service);
        };
    }

    public void updateServiceForProject(int id, List<String> services) {
        deleteServiceProject(id);
        for (String service : services) {
            addServiceForProject(id, Integer.parseInt(service));
        }
    }

    public void deleteServiceProject(int id) {
        conn.withExtension(ServiceDAO.class, dao -> dao.deleteServiceProject(id));
    }
    private boolean isExist(Service service){
        return conn.withExtension(ServiceDAO.class, dao -> dao.isExist(service));
    }

    public int add(Service service) {
        return isExist(service)?-1:conn.withExtension(ServiceDAO.class, dao -> dao.add(service));
    }

    public int update(Service service) {
        return conn.withExtension(ServiceDAO.class, dao -> dao.update(service));
    }

    public Service getById(int id) {
        return conn.withExtension(ServiceDAO.class, dao -> dao.getById(id));
    }

}
