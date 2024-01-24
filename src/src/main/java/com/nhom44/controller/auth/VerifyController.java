package com.nhom44.controller.auth;

import com.nhom44.services.UserService;
import com.nhom44.services.VerifyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/verify"})
public class VerifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = req.getParameter("code");
        if(token!=null){
            int userId = VerifyService.getInstance().getUserIdByCode(token);
            System.out.println(userId);
            UserService.getInstance().updateSuccessVerify(userId);
            resp.sendRedirect(req.getContextPath()+"/login");
        }
    }
}
