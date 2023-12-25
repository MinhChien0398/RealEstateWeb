package com.nhom44.services;

import com.nhom44.DAO.ProvinceDAO;
import com.nhom44.bean.Province;
import com.nhom44.bean.User;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProvinceService  {
    private Jdbi conn;
    private static ProvinceService instance;

    private ProvinceService() {
        conn = JDBIConnector.get();
    }

    public static ProvinceService getInstance() {
        return instance != null ? instance : (instance = new ProvinceService());
    }

    public List<Province> getAllProvince() {
        return conn.withExtension(ProvinceDAO.class, dao -> dao.getAllProvince());
    }
    public String getSpecificId(String province){
        return conn.withExtension(ProvinceDAO.class,dao->dao.getSpecificId(province));
    }
    public static void main(String[] args) {
           }
}
