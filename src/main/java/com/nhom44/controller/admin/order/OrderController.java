package com.nhom44.controller.admin.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/admin/order"})
public class OrderController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action != null && action.equals("detail")){
            req.getRequestDispatcher("/views/admin/order/order_detail.jsp").forward(req,resp);
            return;
        }
        req.getRequestDispatcher("/views/admin/order/contact_order.jsp").forward(req,resp);

    }
}
