package com.nhom44.bean;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

public class Category {
    private int id;
    private String name;
    private int status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Category() {
    }

    public Category(int id, String name, int status, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id && status == category.status && Objects.equals(name, category.name) && Objects.equals(createdAt, category.createdAt) && Objects.equals(updatedAt, category.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, createdAt, updatedAt);
    }
}
