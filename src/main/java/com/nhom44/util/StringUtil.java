package com.nhom44.util;


import com.nhom44.bean.Image;

public class StringUtil {
    public static String projectFolder(int id) {
        String folder = id + "";
        while (folder.length() < 4) {
            folder = "0" + folder;
        }
        return folder;
    }
    public static Image getImage(String path) {
        Image image = new Image();
        image.setPath(path.substring(0,path.lastIndexOf("/")));
        image.setName(path.substring(path.lastIndexOf("/") + 1));
        return image;
    }
}
