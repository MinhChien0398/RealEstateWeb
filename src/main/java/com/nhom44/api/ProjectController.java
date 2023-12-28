package com.nhom44.api;

import com.google.gson.Gson;
import com.nhom44.bean.Project;
import com.nhom44.services.ProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/api/project")
public class ProjectController extends HttpServlet {
    private Gson gson;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectService projectService = ProjectService.getInstance();
        PrintWriter printWriter = resp.getWriter();

        gson = new Gson();
        List<Project> projects = projectService.getAllProject();
        String json = gson.toJson(projects);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
