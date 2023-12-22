package com.nhom44.DAO;


import com.nhom44.bean.User;
import org.jdbi.v3.core.mapper.JoinRow;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.config.RegisterJoinRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

@RegisterFieldMapper(User.class)
public interface UserDAO {
    @SqlUpdate("INSERT INTO users(fullname, email, password, role, avatar, phone , provinceId, birthday, gender, status, createdAt, updatedAt)" +
            " value(:fullname,:email,:password,:role, :avatar, :phone,:provinceId ,:birthday, :gender, :status, :createdAt, :updatedAt")
    int insertUser(@Bind("fullname") String fulllName, @Bind("email") String email, @Bind("password") String password,
                   @Bind("role") int role, @Bind("avatar") int avatar, @Bind("phone") String phone,
                   @Bind("provinceId") int provinceId, @Bind("birthday") Date birthday, @Bind("gender") int gender,
                   @Bind("status") int status, @Bind("createdAt")Timestamp createdAt, @Bind("updatedAt")Timestamp updatedAt);

    @SqlUpdate("UPDATE users SET fullname =: fullName , email =:email , password =: password, role =:role, avatar=:avatar,phone=:phone, birthday=:birthday," +
            " gender=:gender, status=:status, createdAt=:createdAt, updatedAt=:updatedAt WHERE id=:id")
    void updateUser(@BindBean User user);

    @SqlUpdate("UPDATE users SET provinceId=:provinceId WHERE id=:id")
    void updateProvinceForUser(@Bind("id") int id);

    @SqlQuery("Select u.fullname, u.email,u.password,u.phone, u.gender,u.status,u.role,p.name as province " +
            "FROM users u Left Join provinces p ON u.provinceId=p.id")
    List<User> getAllUser();
@SqlQuery("Select COUNT(u.id) FROM users u WHERE u.email=:email")
    String getIdUserWithEmail(@Bind("email") String email);

}
