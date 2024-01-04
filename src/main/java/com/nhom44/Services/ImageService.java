package com.nhom44.services;
import com.nhom44.DAO.ImageDAO;
import com.nhom44.bean.Image;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.time.LocalDateTime;

public class ImageService {
    private static ImageService instance;
    private static Jdbi conn;
    private ImageService() {
        conn= JDBIConnector.get();
    }
    public static ImageService getInstance() {
        return instance != null ? instance : (instance = new ImageService());
    }
    public int add(Image image) {
        image.setCreatedAt(LocalDateTime.now().toString());
        image.setUpdatedAt(LocalDateTime.now().toString());
       int i= conn.withExtension(ImageDAO.class, dao -> dao.addImage(image));
        return i==1?conn.withExtension(ImageDAO.class, dao -> dao.getIdImage(image)):0;
    }

    public int addImageForProject(int id, int idImg) {
        return conn.withExtension(ImageDAO.class, dao -> dao.addProjectImage(id,idImg));
    }
}
