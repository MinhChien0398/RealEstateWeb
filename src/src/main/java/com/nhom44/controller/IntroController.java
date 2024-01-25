package com.nhom44.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.net.http.HttpClient;
@WebServlet(urlPatterns = "/intro")
public class IntroController extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        req.setAttribute("page", "intro");
        req.getRequestDispatcher("/views/public/intro.jsp").forward(req, resp);
    }
}
