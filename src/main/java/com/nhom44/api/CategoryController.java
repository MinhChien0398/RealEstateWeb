package com.nhom44.api;

import com.google.gson.Gson;
import com.nhom44.bean.Category;
import com.nhom44.services.CategoryService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.apache.commons.beanutils.converters.SqlDateConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.List;

@WebServlet(urlPatterns = "/api/category")
public class CategoryController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categories = CategoryService.getInstance().getAll();
        Gson gson = new Gson();
        PrintWriter printWriter = resp.getWriter();
        String json = gson.toJson(categories);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action") == null ? "#" : req.getParameter("action");
        if (action.equals("add")) {
            Category category = new Category();
            try {
                DateTimeConverter dateTimeConverter = new SqlDateConverter(null);
                dateTimeConverter.setPattern("yyyy-MM-dd HH:mm:ss");
                ConvertUtils.register(dateTimeConverter, Date.class);
                BeanUtils.populate(category, req.getParameterMap());
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
