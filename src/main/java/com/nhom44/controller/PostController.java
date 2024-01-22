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


public class PostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/public/postProject.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
