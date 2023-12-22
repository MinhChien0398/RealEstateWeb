package com.nhom44.services;

import com.nhom44.DAO.ProvinceDAO;
import com.nhom44.DAO.UserDAO;
import com.nhom44.bean.Province;
import com.nhom44.bean.User;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class UserService{
    private static UserService instance;
    private Jdbi conn;

    private UserService() {
        conn = JDBIConnector.get();
    }

    public static UserService getInstance() {
        return instance != null ? instance : (instance = new UserService());
    }

    public List<User> getAllUser() {
        return conn.withExtension(UserDAO.class, dao -> dao.getAllUser());
    }

    public int getIdUserWithEmail(String email) {
        return conn.withExtension(UserDAO.class, dao -> dao.getIdUserWithEmail(email));

    }

    private boolean isContainEmail(String email) {
        return conn.withExtension(UserDAO.class, dao -> dao.NumOfSameEmailContain(email)) == 1;
    }

    public int additional(String email, String password, String name, Date birthday, String phone, String province, String isMale, String status, String role) {
        if (isContainEmail(email)) {
            return -1;
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFullName(name);
        user.setBirthday(new java.sql.Date(birthday.getTime()));
        user.setAvatar(-1);
        user.setPhone(phone);
        user.setProvince(province);
        user.setGender(isMale != null ? 1 : 0);
        user.setStatus(Integer.parseInt(status));
        user.setRole(Integer.parseInt(role));
        String idProvince = conn.withExtension(ProvinceDAO.class, handle -> handle.getSpecificId(user.getProvince()));
        int line=conn.withExtension(UserDAO.class, handle -> handle.insertUser(user.getFullName(),
                user.getEmail(), user.getPassword(),
                user.getRole(),  user.getPhone(), Integer.parseInt(idProvince),
             user.getGender(),    (java.sql.Date) user.getBirthday(), user.getStatus()));
        return line;
    }

    public static void main(String[] args) {
        int id = getInstance().additional("user1@gmail.com", "123456", "nguoi dung", new java.sql.Date(23, 12, 2009), "0908300400", "Bình Dương", "on", "1", "1");
    }
}
