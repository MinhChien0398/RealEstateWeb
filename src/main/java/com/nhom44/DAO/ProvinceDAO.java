package com.nhom44.DAO;

import com.nhom44.bean.Province;
import com.nhom44.bean.User;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterFieldMapper(Province.class)
public interface ProvinceDAO {
@SqlQuery("SELECT * FROM provinces")
    List<Province> getAllProvince();
@SqlQuery("SELECT id FROM provinces where name=:name")
    String getSpecificId(@Bind("name") String name);
}
