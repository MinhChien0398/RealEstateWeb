package com.nhom44.services;

import com.nhom44.DAO.ProvinceDAO;
import com.nhom44.DAO.UserDAO;
import com.nhom44.bean.Province;
import com.nhom44.bean.User;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


public class UserService {
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


    public User additional(String email, String password, String name, Date birthday, String phone, String province, String isMale, String status, String role) throws Exception {
        if (isContainEmail(email)) {
            throw new Exception();
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFullName(name);
        user.setBirthday(new java.sql.Date(birthday.getTime()));
        user.setAvatar(null);
        user.setPhone(phone);
        user.setProvince(province);
        user.setGender(isMale != null ? 1 : 0);
        user.setStatus(Integer.parseInt(status));
        user.setRole(Integer.parseInt(role));
        String idProvince = conn.withExtension(ProvinceDAO.class, handle -> handle.getSpecificId(user.getProvince()));
        int line=Integer.MIN_VALUE;
            line = conn.withExtension(UserDAO.class, handle -> handle.insertUser(user.getFullName(),
                    user.getEmail(), user.getPassword(),
                    user.getRole(), user.getPhone(), Integer.parseInt(idProvince),
                    user.getGender(), (java.sql.Date) user.getBirthday(), user.getStatus()));
            if(line==1){
                user.setPassword(null);
                return user;
            }
            return user;
    }

    private int updateProvinceId(int id, String email) {
        return conn.withExtension(UserDAO.class, dao -> dao.updateProvinceForUser(id, email));
    }

    public int update(String oldEmail, String email, String password, String name, Date birthday, String phone, String province, String isMale, String status, String role) {
        String idProvince = ProvinceService.getInstance().getSpecificId(province);

        try {
            if(!oldEmail.equals(email)){
                User u= getUserByEmail(email);
                if(u!=null){
                    throw new Exception("Email đã tồn tại");
                }
            }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFullName(name);
        user.setBirthday(new java.sql.Date(birthday.getTime()));
        user.setAvatar(null);
        user.setPhone(phone);
        user.setGender(isMale != null ? 1 : 0);
        user.setStatus(Integer.parseInt(status));
        user.setRole(Integer.parseInt(role));
        int id = Integer.parseInt(idProvince);
        int checkUpdateProvince = updateProvinceId(id, oldEmail);
        int checkUpdateOther = conn.withExtension(UserDAO.class, dao -> dao.updateUser(user, oldEmail));
        return Math.max(checkUpdateOther, checkUpdateProvince);
        } catch (Throwable t) {
            return -1;
        }
    }



    public User getUserByEmail(String email) {
        return conn.withExtension(UserDAO.class, dao -> dao.getUserByEmail(email));
    }
}
