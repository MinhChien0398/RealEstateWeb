package com.nhom44.controller.admin.project;

import com.nhom44.bean.Category;
import com.nhom44.bean.Post;
import com.nhom44.bean.Project;
import com.nhom44.bean.Province;
import com.nhom44.services.CategoryService;
import com.nhom44.services.PostService;
import com.nhom44.services.ProjectService;
import com.nhom44.services.ProvinceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/admin/project_management")
public class ProjectManagementController extends HttpServlet {

    private ProjectService projectService = ProjectService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equalsIgnoreCase("manager")) {
            List<Project> projects = projectService.getAllProject();
            req.setAttribute("projects", projects);
            req.getRequestDispatcher("/views/admin/project/project_manage.jsp").forward(req, resp);
        } else if (action.equalsIgnoreCase("add")) {
            ProvinceService provinceService = ProvinceService.getInstance();
//            CategoryService categoryService = CategoryService.getInstance();
//            PostService postService = PostService.getInstance();
            List<Province> provinces = provinceService.getAllProvince();
//            List<Category> categories = categoryService.getAllCategory();
//            List<Post> posts = postService.getAllPost();
            req.getSession().setAttribute("provinces", provinces);
//            req.getSession().setAttribute("categories", categories);
//            req.getSession().setAttribute("posts", posts);
            req.getRequestDispatcher("/views/admin/project/add_project.jsp").forward(req, resp);
        } else if (action.equalsIgnoreCase("edit")) {

            req.getRequestDispatcher("/views/admin/project/update_project_page.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        req.setCharacterEncoding("UTF-8");
        boolean isErr = false;

    }
}
