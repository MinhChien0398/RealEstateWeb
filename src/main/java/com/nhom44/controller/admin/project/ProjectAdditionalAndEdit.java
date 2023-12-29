package com.nhom44.controller.admin.project;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/admin/project_additional_and_edit")
public class ProjectAdditionalAndEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action")==null|| req.getParameter("action").isEmpty() ?"add":req.getParameter("action");
        if (action.equals("add")){

            req.getRequestDispatcher("/views/admin/project/add_project.jsp").forward(req, resp);
        }
    }
}
