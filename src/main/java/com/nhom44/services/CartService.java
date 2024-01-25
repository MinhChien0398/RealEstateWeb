package com.nhom44.services;

import com.nhom44.DAO.CartDAO;
import com.nhom44.bean.Cart;
import com.nhom44.db.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.io.Serializable;
import java.sql.Timestamp;

public class CartService implements Serializable {
    private static CartService instance;
    private Jdbi conn;

    private CartService() {
        conn = JDBIConnector.get();
    }

    public static CartService getInstance() {
        return instance != null ? instance : (instance = new CartService());
    }

    public Cart add(Cart cart) {
        String now = Timestamp.valueOf(java.time.LocalDateTime.now()).toString();
        cart.setCreatedAt(now);
        cart.setUpdatedAt(now);
        System.out.println(cart.toString());
       int check= conn.withExtension(CartDAO.class, dao -> dao.add(cart));
       return check==1?getByObject(cart):null;
    }

    private Cart getByObject(Cart cart) {
        return conn.withExtension(CartDAO.class, dao -> dao.getByObject(cart));
    }

    public void addImage(int id, int imageId) {
        conn.withExtension(CartDAO.class, dao -> dao.addImage(id, imageId));
    }

    public void updateSuccessVerifyCart(int cartId) {
        conn.withExtension(CartDAO.class, dao -> dao.updateSuccessVerifyCart(cartId));
    }
}
