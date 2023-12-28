package com.nhom44.DAO;

import com.nhom44.bean.Service;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;

@RegisterFieldMapper(Service.class)
public interface ServiceDAO {

}
