package com.nhom44.DAO;

import com.nhom44.bean.Cart;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

@RegisterBeanMapper(Cart.class)
public interface CartDAO {
    @SqlUpdate("INSERT INTO carts(email, categoryId, provinceId,width,height,representProjectId, createdAt, updatedAt) VALUES (:email,:categoryId, :provinceId,:width,:height,:representProjectId, :createdAt, :updatedAt)")
    Integer add(@BindBean Cart cart);

    @SqlQuery("SELECT * From carts WHERE email=:email AND categoryId=:categoryId AND provinceId=:provinceId AND width=:width AND height=:height AND representProjectId=:representProjectId")
    Cart getByObject(@BindBean Cart cart);
    @SqlUpdate("INSERT INTO carts_images(cartId, imageId) VALUES(:id, :imageId)")
    Integer addImage(@Bind("id") int id,@Bind("imageId") int imageId);
}
