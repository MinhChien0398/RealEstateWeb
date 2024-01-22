package com.nhom44.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Order implements Serializable {
    private int id;
    private String email;
    private int categoryId;
    private int provinceId;
    private int representProjectId;
    private double width;
    private double height;
    private List<Integer> services;
    private List<String> images;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", categoryId=" + categoryId +
                ", provinceId=" + provinceId +
                ", representProjectId=" + representProjectId +
                ", width=" + width +
                ", height=" + height +
                ", services=" + services +
                ", images=" + images +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && categoryId == order.categoryId && provinceId == order.provinceId && representProjectId == order.representProjectId && Double.compare(width, order.width) == 0 && Double.compare(height, order.height) == 0 && Objects.equals(email, order.email) && Objects.equals(services, order.services) && Objects.equals(images, order.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, categoryId, provinceId, representProjectId, width, height, services, images);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getRepresentProjectId() {
        return representProjectId;
    }

    public void setRepresentProjectId(int representProjectId) {
        this.representProjectId = representProjectId;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Integer> getServices() {
        return services;
    }

    public void setServices(List<Integer> services) {
        this.services = services;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Order() {
    }

    public Order(int id, String email, int categoryId, int provinceId, int representProjectId, double width, double height, List<Integer> services, List<String> images) {
        this.id = id;
        this.email = email;
        this.categoryId = categoryId;
        this.provinceId = provinceId;
        this.representProjectId = representProjectId;
        this.width = width;
        this.height = height;
        this.services = services;
        this.images = images;
    }
}
