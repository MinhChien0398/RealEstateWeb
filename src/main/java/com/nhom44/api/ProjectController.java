package com.nhom44.api;

import com.google.gson.Gson;
import com.nhom44.bean.Project;
import com.nhom44.services.ProjectService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@WebServlet(urlPatterns = "/api/project")
public class ProjectController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Project>projects= ProjectService.getInstance().getAllProject();
projects.forEach(project -> project.setUpdatedAt(project.getUpdatedAt().trim()
//        .substring(0,project.getUpdatedAt().indexOf(" "))
));
        Gson gson= new Gson();
        PrintWriter printWriter= resp.getWriter();
        String json= gson.toJson(projects);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String action= req.getParameter("action")==null?"#":req.getParameter("action");
        resp.addHeader("Access-Control-Allow-Origin", "*");
       if(action.equals("add")){
           Project project= new Project();
           try {
               BeanUtils.populate(project,req.getParameterMap());
               System.out.println(project.toString());
           } catch (IllegalAccessException e) {
               throw new RuntimeException(e);
           } catch (InvocationTargetException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
