package com.nhom44.DAO;

import com.nhom44.bean.Contact;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
@RegisterBeanMapper(Contact.class)
public interface ContactDAO {
    @SqlUpdate("INSERT INTO contacts(fullname, email, categoryId, projectId, content)" +
            " VALUES(:fullname, :email, :categoryId, :projectId, :content)")
    Integer add(@BindBean Contact contact);
}
