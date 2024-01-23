package com.nhom44.controller.user;

import com.nhom44.bean.Project;
import com.nhom44.bean.User;
import com.nhom44.services.ProjectService;
import com.nhom44.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/user/save-list")
public class SaveListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("page","save-list");
        User user= (User) req.getSession().getAttribute("auth");
        List<Project> projects = ProjectService.getInstance().getLikedProjectByUserId(user.getId());
        req.setAttribute("projects",projects);
        req.getRequestDispatcher("/views/user/savedList.jsp").forward(req,resp);
    }
}
