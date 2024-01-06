package com.nhom44.controller.admin.slide;

import com.nhom44.services.SliderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/admin/slide","/admin/slide/add","/admin/slide/edit","/admin/slide/delete"})
public class SliderController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());
        req.setAttribute("sliders", SliderService.getInstance().getAll());
        req.getRequestDispatcher("/views/admin/slide/slide_manage.jsp").forward(req, resp);

    }
}
