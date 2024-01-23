package com.nhom44.api.user;

import com.google.gson.Gson;
import com.nhom44.bean.ResponseModel;
import com.nhom44.bean.User;
import com.nhom44.services.UserService;
import com.nhom44.util.StringUtil;
import com.nhom44.validator.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/api/user", "/api/user/update"})
public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameterMap().keySet().toString());
        User user = (User) req.getSession().getAttribute("auth");
        HttpSession session = req.getSession();
        List<ResponseModel> errMess = new ArrayList<>();
        ResponseModel responseModel = null;
        Gson gson = new Gson();
        PrintWriter writer = resp.getWriter();
        SingleValidator singleValidator = new EmailSingleValidator();
        String fullName = req.getParameter("fullName") == null ? "" : req.getParameter("fullName");
        String email = req.getParameter("email") == null ? "" : req.getParameter("email");
        String password = req.getParameter("password") == null ? "" : req.getParameter("password");
        String phone = req.getParameter("phone") == null ? "" : req.getParameter("phone");
        String address = req.getParameter("provinceId") == null ? "" : req.getParameter("provinceId");
        String birthday = req.getParameter("birthday") == null ? "" : req.getParameter("birthday");
        String rePassword = req.getParameter("rePassword") == null ? "" : req.getParameter("rePassword");
        if (!email.equals(user.getEmail()))
            if(UserService.getInstance().isContainEmail(email)){
                responseModel = new ResponseModel();
                responseModel.setName("email");
                responseModel.setMessage("Email đã tồn tại");
                errMess.add(responseModel);
            }else
            if (!email.equals("") && !singleValidator.validator(email)) {
                responseModel = new ResponseModel();
                responseModel.setName("email");
                responseModel.setMessage("Email không hợp lệ");
                errMess.add(responseModel);
            } else user.setEmail(email);
        singleValidator = new TitleOrNameSingleValidator();
        if (fullName != user.getFullName())
            if (!fullName.equals("") && !singleValidator.validator(fullName)) {
                responseModel = new ResponseModel();
                responseModel.setName("fullName");
                responseModel.setMessage("Tên không hợp lệ");
                errMess.add(responseModel);
            } else user.setFullName(fullName);
        if (!password.equals(""))
            if (!singleValidator.validator(password) && !singleValidator.validator(rePassword) && password.equals(rePassword)) {
                responseModel = new ResponseModel();
                responseModel.setName("password");
                responseModel.setMessage("Mật khẩu không hợp lệ");
                errMess.add(responseModel);
            } else user.setPassword(StringUtil.hashPassword(password));
        singleValidator = new PhoneValidator();
        if (phone.equals(user.getPhone()))
            if (phone != "" && !singleValidator.validator(phone)) {
                responseModel = new ResponseModel();
                responseModel.setName("phone");
                responseModel.setMessage("Số điện thoại không hợp lệ");
                errMess.add(responseModel);
            } else user.setPhone(phone);
        singleValidator = new NumberVallidator();
        if (address.equals(user.getProvinceId() + "") )
            if (address != "" && !singleValidator.validator(address)) {
                responseModel = new ResponseModel();
                responseModel.setName("address");
                responseModel.setMessage("Địa chỉ không hợp lệ");
                errMess.add(responseModel);
            } else user.setProvinceId(Integer.parseInt(address));
        singleValidator = new DateValidator();
        java.util.Date dbirthday = null;
        if (birthday.equals(user.getBirthday().toString()))
            if (birthday == null || birthday.trim().isEmpty()) {
                req.setAttribute("birthday", "Ngày sinh không hợp lệ");
                responseModel = new ResponseModel();
                responseModel.setMessage("Vui lòng chọn ngày sinh");
                responseModel.setData(null);
                responseModel.setName("birthday");
                errMess.add(responseModel);
            } else {
                SimpleDateFormat dmy = new SimpleDateFormat("yyyy-MM-dd");
                dmy.setLenient(false);
                try {
                    dbirthday = dmy.parse(birthday);
                } catch (Exception e) {
                    req.setAttribute("birthday", "Ngày sinh không hợp lệ");
                    responseModel = new ResponseModel();
                    responseModel.setMessage("Ngày sinh không hợp lệ");
                    responseModel.setData(null);
                    responseModel.setName("birthday");
                    errMess.add(responseModel);
                }
            }
        if (errMess.size() > 0) {
            resp.setStatus(400);
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            writer.println(gson.toJson(errMess));
            writer.flush();
            return;
        }
        UserService.getInstance().update(user);
        resp.setStatus(200);
        session.setAttribute("auth", user);
        responseModel = new ResponseModel();
        responseModel.setName("success");
        responseModel.setData("/user");
        writer.flush();
        System.out.println(user.toString());
    }
}
