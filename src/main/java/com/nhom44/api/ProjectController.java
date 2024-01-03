package com.nhom44.api;

import com.google.gson.Gson;
import com.nhom44.bean.Project;
import com.nhom44.services.ProjectService;
import com.nhom44.util.StringUtil;
import com.nhom44.util.Upload;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@WebServlet(urlPatterns = "/api/project")
@MultipartConfig(
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 10 * 5,
        fileSizeThreshold = 1024 * 1024 * 10)
public class ProjectController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Project> projects = ProjectService.getInstance().getAllProject();
        projects.forEach(project -> project.setUpdatedAt(project.getUpdatedAt().trim()
//        .substring(0,project.getUpdatedAt().indexOf(" "))
        ));
        System.out.println(projects);
        Gson gson = new Gson();
        PrintWriter printWriter = resp.getWriter();
        String json = gson.toJson(projects);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action") == null ? "#" : req.getParameter("action");
        if (action.equals("add")) {
            Project project = new Project();
            try {
                DateTimeConverter dateTimeConverter = new SqlDateConverter(null);
                dateTimeConverter.setPattern("yyyy-MM-dd HH:mm:ss");
                ConvertUtils.register(dateTimeConverter, Date.class);
                BeanUtils.populate(project, req.getParameterMap());
                String ownEmail= req.getParameter("ownEmail");
                System.out.println(ownEmail);
//                List<String> fileNames = Upload.uploadFile(Upload.UPLOAD_PROJECT+ StringUtil.projectFolder(), "avatar", req);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
