package com.nhom44.controller;

import com.nhom44.DAO.ImageDAO;
import com.nhom44.bean.Project;
import com.nhom44.bean.Post;
import com.nhom44.bean.Image;
import com.nhom44.bean.Service;
import com.nhom44.services.ImageService;
import com.nhom44.services.PostService;
import com.nhom44.services.ProjectService;
import com.nhom44.services.ServiceOfProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/post/project", "/post/service"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 10 MB
        maxFileSize = 1024 * 1024 * 0, // 50 MB
        maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class PostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String FindingID = req.getParameter("id");
        if (FindingID == null) {
            resp.sendRedirect("/404");
            return;
        }
        if (url.equals("/post/project")) {
            try {
                Project project = ProjectService.getInstance().getActiveById(Integer.parseInt(FindingID));
                project.setUpdatedAt(project.getUpdatedAt().substring(0, 10));
                List<Service> services = ServiceOfProjectService.getInstance().getServicesByProjectId(Integer.parseInt(FindingID));
                List<String> gallery = ImageService.getInstance().getGroupImagesByProjectId(Integer.parseInt(FindingID));
                Post post = PostService.getInstance().getById(project.getPostId());
                List<Project> suggestProjects = ProjectService.getInstance().getSuggestProjects(project.getCategoryId());
                req.setAttribute("suggestProjects", suggestProjects);
                req.setAttribute("gallery", gallery);
                req.setAttribute("services", services);
                req.setAttribute("post", post);
                req.setAttribute("project", project);
                req.getRequestDispatcher("/views/public/postProject.jsp").forward(req, resp);
                return;
            } catch (NullPointerException e) {
                resp.sendRedirect("/404");
                return;
            }
        }
        if (url.equals("/post/service")) {
            try {
                Service service = ServiceOfProjectService.getInstance().getActiveById(Integer.parseInt(FindingID));
                service.setUpdatedAt(service.getUpdatedAt().substring(0, 10));
                Post post = PostService.getInstance().getById(service.getPostId());
                List<Service> suggestServices = ServiceOfProjectService.getInstance().getSuggestServices();
                req.setAttribute("suggestServices", suggestServices);
                req.setAttribute("post", post);
                req.setAttribute("service", service);
                req.getRequestDispatcher("/views/public/postService.jsp").forward(req, resp);
                return;
            } catch (NullPointerException e) {
                resp.sendRedirect("/404");
                return;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action") != null ? req.getParameter("action") : "";
        if (action.equals("cast")) {
            String name = req.getParameter("name");
            resp.getWriter().println("Hello " + name);
            return;
        }
    }
}
