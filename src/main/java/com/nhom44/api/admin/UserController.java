package com.nhom44.api.admin;

import com.google.gson.Gson;
import com.nhom44.bean.ResponseModel;
import com.nhom44.services.UserService;
import com.nhom44.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/api/admin/user")
public class UserController extends HttpServlet {
    private Gson gson;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = UserService.getInstance();
        PrintWriter printWriter = resp.getWriter();

        gson = new Gson();
        List<User> users = userService.getAllUser();
        String json = gson.toJson(users);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        gson = new Gson();
        System.out.println("step 1");
        UserService userService = UserService.getInstance();
        PrintWriter printWriter = resp.getWriter();
        List<ResponseModel> errMess = new ArrayList<>();
        String action = req.getParameter("action");
        boolean isErr = false;
        String email = req.getParameter("email")==null?"":req.getParameter("email");
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println("step 1.5");
        if (!matcher.matches()) {
            req.setAttribute("email", "Email không hợp lệ");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Email không hợp lệ");
            responseModel.setData(null);
            responseModel.setName("email");
            errMess.add(responseModel);
            isErr = true;
        }
        System.out.println("step 2");
        String password = req.getParameter("password");
         if (password.length() < 6) {
            req.setAttribute("password", "Mật khẩu phải có ít nhất 6 ký tự");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Mật khẩu phải có ít nhất 6 ký tự");
            responseModel.setData(null);
            responseModel.setName("password");
            errMess.add(responseModel);

            isErr = true;
        }
        System.out.println("step 3");
        String name = req.getParameter("fullname");
        if (name == null || name.trim().isEmpty() || name.length() < 6) {
            req.setAttribute("fullname", "Tên phải có ít nhất 6 ký tự");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setName("fullname");
            responseModel.setMessage("Tên phải có ít nhất 6 ký tự");
//            responseModel.setData(null);
            errMess.add(responseModel);
            isErr = true;
        }
        System.out.println("step 4");
        String ip_birthday = req.getParameter("birthday");
        Date birthday = null;
        if (ip_birthday == null || ip_birthday.trim().isEmpty()) {
            req.setAttribute("birthday", "Vui lòng chọn ngày sinh");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Vui lòng chọn ngày sinh");
            responseModel.setData(null);
            responseModel.setName("birthday");
            errMess.add(responseModel);
            isErr = true;
        } else {
            SimpleDateFormat dmy = new SimpleDateFormat("yyyy/MM/dd");
            dmy.setLenient(false);
            try {
                birthday = dmy.parse(ip_birthday);
            } catch (Exception e) {
                req.setAttribute("birthday", "Ngày sinh không hợp lệ");
                ResponseModel responseModel = new ResponseModel();
                responseModel.setMessage("Ngày sinh không hợp lệ");
                responseModel.setData(null);
                responseModel.setName("birthday");
                errMess.add(responseModel);
                isErr = true;
            }
        }
        System.out.println("step 5");
        String phone = req.getParameter("phone");
        String regexPhone = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        Pattern patternPhone = Pattern.compile(regexPhone);
        Matcher matcherPhone = patternPhone.matcher(phone);
        if (phone.length() < 10) {
            req.setAttribute("phone", "Số điện thoại phải có ít nhất 10 ký tự");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Số điện thoại phải có ít nhất 10 ký tự");
            responseModel.setData(null);
            responseModel.setName("phone");
            errMess.add(responseModel);
            isErr = true;
        } else if (!matcherPhone.matches()) {
            req.setAttribute("phone", "Số điện thoại không hợp lệ");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Số điện thoại không hợp lệ");
            responseModel.setData(null);
            responseModel.setName("phone");
            errMess.add(responseModel);
            isErr = true;
        }
        System.out.println("step 6");
        String province = req.getParameter("province");

        String isMale = req.getParameter("isMale") == null ? "" : req.getParameter("isMale");
        String isFemale = req.getParameter("isFemale") == null ? "" : req.getParameter("isFemale");
        if (isMale.isEmpty() && isFemale.isEmpty()) {
            req.setAttribute("gender", "Vui lòng chọn giới tính");
            ResponseModel responseModel = new ResponseModel();
            responseModel.setMessage("Vui lòng chọn giới tính");
            responseModel.setData(null);
            responseModel.setName("gender");
            errMess.add(responseModel);
            isErr = true;
        }
        System.out.println("step 7");
        String status = req.getParameter("status");
        String role = req.getParameter("role");
        System.out.println("ready");
        if (isErr) {
            resp.setStatus(400);
            printWriter.println(gson.toJson(errMess));
            printWriter.flush();
            printWriter.close();
//            req.getRequestDispatcher("/views/admin/user/add_user.jsp").forward(req, resp);
            return;

        }
        if (action.equalsIgnoreCase("add")) {
            ResponseModel responseModel = null;
            User user = null;
            try {
                user = userService.additional(email, password, name, new java.sql.Date(birthday.getTime()), phone, province, isMale, status, role);

            } catch (Exception e) {
                resp.setStatus(400);
                responseModel = new ResponseModel();
                responseModel.setName("email");
                responseModel.setMessage("Email đã tồn tại");
                errMess.add(responseModel);
                printWriter.print(gson.toJson(errMess));
                return;
            }
            if (user.getPassword() == null) {
                responseModel = new ResponseModel<>();
                responseModel.setName("success");
                responseModel.setMessage("Thêm thành công");
                responseModel.setData(user);
                resp.setStatus(200);
                printWriter.print(gson.toJson(responseModel));
            } else if (user.getPassword() != null) {
                responseModel = new ResponseModel<>();
                resp.setStatus(200);
                responseModel.setName("sys");
                responseModel.setMessage("Thêm thất bại");
                responseModel.setData(user);
                printWriter.print(gson.toJson(responseModel));
            }
            printWriter.flush();
            printWriter.close();
//            req.getRequestDispatcher()
        }
        if (action.equalsIgnoreCase("edit")) {
            ResponseModel responseModel = null;
            String oldEmail = req.getParameter("oldEmail");
            int check = userService.update(oldEmail, email, password, name, new java.sql.Date(birthday.getTime()), phone, province, isMale, status, role);
            if (check == -1) {
                resp.setStatus(400);
                responseModel = new ResponseModel();
                responseModel.setName("email");
                responseModel.setMessage("Email đã tồn tại");
                errMess.add(responseModel);
                printWriter.print(gson.toJson(errMess));
                return;
            }
            if (check == 1) {
                responseModel = new ResponseModel<>();
                responseModel.setName("success");
                responseModel.setMessage("Thêm thành công");
                resp.setStatus(200);
                printWriter.print(gson.toJson(errMess));
                return;
            }
            if (check == 0) {
                resp.setStatus(200);
                responseModel.setName("sys");
                responseModel.setMessage("Thêm thất bại");
                printWriter.print(gson.toJson(responseModel));
                return;
            }
            printWriter.flush();
            printWriter.close();
        }

    }
}
