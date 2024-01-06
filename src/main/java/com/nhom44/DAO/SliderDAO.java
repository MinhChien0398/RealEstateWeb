package com.nhom44.DAO;

import com.nhom44.bean.Slider;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterBeanMapper(Slider.class)
public interface SliderDAO {
    @SqlQuery("SELECT * FROM sliders")
    List<Slider> getAll();
}
