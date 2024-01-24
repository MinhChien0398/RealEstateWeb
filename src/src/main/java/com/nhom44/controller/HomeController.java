package com.nhom44.controller;

import com.nhom44.bean.Category;
import com.nhom44.bean.Province;
import com.nhom44.bean.Service;
import com.nhom44.bean.Slider;
import com.nhom44.services.CategoryService;
import com.nhom44.services.ProvinceService;
import com.nhom44.services.ServiceOfProjectService;
import com.nhom44.services.SliderService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();
        List<Slider> sliders = SliderService.getInstance().getAllActive();
        req.setAttribute("sliders", sliders);
        List<Service> services = ServiceOfProjectService.getInstance().getAllActive();
        session.setAttribute("services", services);
        List<Category> categories = CategoryService.getInstance().getAllActive();
        session.setAttribute("categories", categories);
        List<Province> provinces = ProvinceService.getInstance().getAll();
        session.setAttribute("provinces", provinces);

        req.setAttribute("page", "home");
        RequestDispatcher rd = req.getRequestDispatcher("/views/public/home.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
