package com.nhom44.controller;

import com.nhom44.bean.Category;
import com.nhom44.bean.Project;
import com.nhom44.bean.Province;
import com.nhom44.bean.Service;
import com.nhom44.services.CategoryService;
import com.nhom44.services.ProjectService;
import com.nhom44.services.ProvinceService;
import com.nhom44.services.ServiceOfProjectService;
import com.nhom44.util.PriceObjectHelper;
import com.nhom44.util.SearcherProjectUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/project")
public class ProjectController extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        req.setAttribute("page", "project");
       List<Service> services = ServiceOfProjectService.getInstance().getAllActive();
        req.setAttribute("services", services);
        List<Category> categories = CategoryService.getInstance().getAllActive();
        req.setAttribute("categories", categories);
        List<Province> provinces = ProvinceService.getInstance().getAll();
        req.setAttribute("provinces", provinces);
        List<PriceObjectHelper> prices = SearcherProjectUtil.PRICE_SEARCHING;
        req.setAttribute("prices", prices);
        List<Integer> acreages = SearcherProjectUtil.ACREAGE;
        req.setAttribute("acreages", acreages);
        req.getRequestDispatcher("/views/public/project.jsp").forward(req, resp);
    }
}
