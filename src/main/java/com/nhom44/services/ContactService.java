package com.nhom44.services;

import com.nhom44.DAO.ContactDAO;
import com.nhom44.bean.Contact;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

public class ContactService {
    private static  Jdbi conn;
    private static ContactService instance;
    private ContactService() {
        conn = JDBIConnector.get();
    }
    public static ContactService getInstance() {
        return instance != null ? instance : (instance = new ContactService());
    }
    public int add(Contact contact){
        return conn.withExtension(ContactDAO.class, dao -> dao.add(contact));
    }
}