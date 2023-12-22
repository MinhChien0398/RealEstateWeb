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
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        req.setCharacterEncoding("UTF-8");
        boolean isErr = false;
        String email = req.getParameter("email");
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            req.setAttribute("emailErr", "Email không hợp lệ");
            isErr = true;
        }
        String password = req.getParameter("password");
        if (password.length() < 6) {
            req.setAttribute("passwordErr", "Mật khẩu phải có ít nhất 6 ký tự");
            isErr = true;
        }
        String name = req.getParameter("fullname");
        if (name==null||name.trim().isEmpty()) {
            req.setAttribute("fullnameErr", "Tên phải có ít nhất 6 ký tự");
            isErr = true;
        }

        String ip_birthday = req.getParameter("birthday");
        Date birthday = null;
        if (ip_birthday==null|| ip_birthday.trim().isEmpty()) {
            req.setAttribute("birthdayErr", "Vui lòng chọn ngày sinh");
            isErr = true;
        }else{
            SimpleDateFormat dmy= new SimpleDateFormat("dd/MM/yyyy");
            dmy.setLenient(false);
            try {
           birthday=dmy.parse(ip_birthday);
            } catch (Exception e) {
                req.setAttribute("birthdayErr", "Ngày sinh không hợp lệ");
                isErr = true;
            }

        }
        String phone = req.getParameter("phone");
        String regexPhone = "\"^\\\\d{10}$\"";
        Pattern patternPhone = Pattern.compile(regex);
        Matcher matcherPhone = pattern.matcher(email);
        if (phone.length() < 10) {
            req.setAttribute("phoneErr", "Số điện thoại phải có ít nhất 10 ký tự");
            isErr = true;
        } else if (!matcherPhone.matches()) {
            req.setAttribute("phoneErr", "Số điện thoại không hợp lệ");
            isErr = true;
        }
        String province = req.getParameter("province");

        String isMale = req.getParameter("isMale") == null ? "" : req.getParameter("isMale");
        String isFemale = req.getParameter("isFemale") == null ? "" : req.getParameter("isFemale");
        if (isMale.isEmpty() && isFemale.isEmpty()) {
            req.setAttribute("genderErr", "Vui lòng chọn giới tính");
            isErr = true;
        }
        String status=req.getParameter("status");
        String role=req.getParameter("role");
        if (isErr) {
            req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
            return;
        }
        if (action.equalsIgnoreCase("add")) {
            int check=userService.additional(email,password,name,birthday,phone,province,isMale,status,role);
            if(check==-1){
                req.setAttribute("emailErr", "Email đã tồn tại");
                req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
                return;
            }
            if(check==1){
                req.setAttribute("success", "Thêm thành công");
                req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
                return;
            }
            if(check==0){
                req.setAttribute("SysErr", "Thêm thất bại");
                resp.sendRedirect(req.getContextPath() + "/admin/user_management?action=manager");
                return;
            }
        }
        if (action.equalsIgnoreCase("edit")) {
//            int id = Integer.parseInt(req.getParameter("id"));
//            String avatar = req.getParameter("avatar");
//            String createdAt = req.getParameter("createdAt");
//            String updatedAt = req.getParameter("updatedAt");
//            User user = new User(id, Integer.parseInt(avatar), name, email, password, phone, (java.sql.Date) birthday, Integer.parseInt(isMale), Integer.parseInt(status), Timestamp.valueOf(createdAt), Timestamp.valueOf(updatedAt), province, Integer.parseInt(role));
//            userService.updateUser(user);
//            req.setAttribute("success", "Cập nhật thành công");
//            req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
//            return;
        }

    }

}
