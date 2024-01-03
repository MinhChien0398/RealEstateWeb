package com.nhom44.util;

public class StringUtil {
    public static String projectFolder(int id) {
        String folder = id + "";
        while (folder.length() < 5) {
            folder = "0" + folder;
        }
        return folder;
    }
}
