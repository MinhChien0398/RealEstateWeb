package com.nhom44.controller.admin.project;

import com.nhom44.bean.Project;
import com.nhom44.bean.Province;
import com.nhom44.bean.Service;
import com.nhom44.services.CategoryService;
import com.nhom44.services.ProjectService;
import com.nhom44.services.ProvinceService;
import com.nhom44.services.ServiceOfProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/admin/project_additional_and_edit")
public class ProjectAdditionalAndEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoryService categoryService = CategoryService.getInstance();
        req.setAttribute("categories", categoryService.getAll());
        ServiceOfProjectService serviceOfProjectService = ServiceOfProjectService.getInstance();
        req.setAttribute("services", serviceOfProjectService.getAll());
        ProvinceService provinceService = ProvinceService.getInstance();
        req.setAttribute("provinces", provinceService.getAll());
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action") == null || req.getParameter("action").isEmpty() ? "add" : req.getParameter("action");
        if (action.equals("add")) {
            req.getRequestDispatcher("/views/admin/project/add_project.jsp").forward(req, resp);
        } else if (action.equals("edit")) {
            if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
                resp.sendRedirect("/admin/project_management");
                return;
            }
            try {
                int id = Integer.parseInt(req.getParameter("id"));

                Project project = ProjectService.getInstance().getById(id);
                req.setAttribute("project", project);


                List<Service> services = ServiceOfProjectService.getInstance().getServicesByProjectId(id);
                req.setAttribute("servicesOfproject", services);


                ProvinceService provinceService = ProvinceService.getInstance();
                List<Province> provinces = provinceService.getAll();
                req.getSession().setAttribute("provinces", provinces);


                req.getRequestDispatcher("/views/admin/project/update_project_page.jsp").forward(req, resp);
            } catch (NumberFormatException e) {
                resp.sendRedirect("/admin/project_management");
            }
        }
    }
}
