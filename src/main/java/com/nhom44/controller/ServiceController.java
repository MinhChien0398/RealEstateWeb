package com.nhom44.controller;

import com.nhom44.bean.Service;
import com.nhom44.services.ServiceOfProjectService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.List;

@WebServlet(urlPatterns = "/service")
public class ServiceController extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        req.setAttribute("page", "service");
        List<Service> services = ServiceOfProjectService.getInstance().getAllActive();
        for (Service service : services
        ) {
            System.out.println(service);
        }
        req.setAttribute("services", services);
        req.getRequestDispatcher("/views/public/service.jsp").forward(req, resp);
    }
}
