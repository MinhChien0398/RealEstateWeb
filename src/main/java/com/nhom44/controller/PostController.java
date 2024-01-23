package com.nhom44.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/post")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 10 MB
        maxFileSize = 1024 * 1024 * 0, // 50 MB
        maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class PostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/public/postProject.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String action = req.getParameter("action")!=null?req.getParameter("action"):"";
            if(action.equals("cast")){
                String name = req.getParameter("name");
                resp.getWriter().println("Hello "+name);
                return;
            }
    }
}
