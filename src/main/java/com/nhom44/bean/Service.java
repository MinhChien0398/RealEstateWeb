package com.nhom44.bean;

import java.sql.Timestamp;
import java.util.Objects;

public class Service {
    private int id;
    private String name;
    private String description;
    private int postId;
    private int status;
    private String avatar;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Service() {
    }

    public Service(int id, String name, String description, int postId, int status, String avatar, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.postId = postId;
        this.status = status;
        this.avatar = avatar;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
        Service service = (Service) o;
        return id == service.id && postId == service.postId && status == service.status && Objects.equals(name, service.name) && Objects.equals(description, service.description) && Objects.equals(avatar, service.avatar) && Objects.equals(createdAt, service.createdAt) && Objects.equals(updatedAt, service.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, postId, status, avatar, createdAt, updatedAt);
    }
}
