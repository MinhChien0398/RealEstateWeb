package com.nhom44.controller.admin.user;

import com.nhom44.bean.Province;
import com.nhom44.bean.User;
import com.nhom44.services.ProjectService;
import com.nhom44.services.ProvinceService;
import com.nhom44.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/admin/user_management")
public class UserManagementController extends HttpServlet {
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equalsIgnoreCase("manager")) {
            List<User> users = userService.getAllUser();
            req.setAttribute("users", users);
            req.getRequestDispatcher("/views/admin/user/user_manage.jsp").forward(req, resp);
        } else if (action.equalsIgnoreCase("add")) {
            ProvinceService provinceService = ProvinceService.getInstance();
            List<Province> provinces = provinceService.getAllProvince();
            req.getSession().setAttribute("provinces", provinces);
            req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
        } else if (action.equalsIgnoreCase("edit")) {
            ProvinceService provinceService = ProvinceService.getInstance();
            List<Province> provinces = provinceService.getAllProvince();
            req.getSession().setAttribute("provinces", provinces);
            String email = req.getParameter("useremail");
            User user = userService.getUserByEmail(email);
            req.setAttribute("emailValue", user.getEmail());
            req.setAttribute("passwordValue", user.getPassword());
            req.setAttribute("fullnameValue", user.getFullName());
            req.setAttribute("birthdayValue", user.getBirthday());
            req.setAttribute("phoneValue", user.getPhone());

            req.setAttribute("user", user);
            req.getRequestDispatcher("/views/admin/user/update_user.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
