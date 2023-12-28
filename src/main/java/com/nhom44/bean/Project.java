package com.nhom44.bean;

import java.sql.Timestamp;
import java.util.Objects;

public class Project {
    private int id;
    private String title;
    private String description;
    private String avatar;
    private int price;
    private int provinceId;
    private int isAccepted;
    private int postId;
    private int categoryId;
    private int status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Project() {
    }

    public Project(int id, String title, String description, String avatar, int price, int provinceId, int isAccepted, int postId, int categoryId, int status, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.avatar = avatar;
        this.price = price;
        this.provinceId = provinceId;
        this.isAccepted = isAccepted;
        this.postId = postId;
        this.categoryId = categoryId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title=" + title +
                ", description=" + description +
                ", avatar=" + avatar +
                ", price=" + price +
                ", provinceId=" + provinceId +
                ", isAccepted=" + isAccepted +
                ", postId=" + postId +
                ", categoryId=" + categoryId +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(int isAccepted) {
        this.isAccepted = isAccepted;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        Project project = (Project) o;
        return id == project.id && price == project.price && provinceId == project.provinceId && isAccepted == project.isAccepted && postId == project.postId && categoryId == project.categoryId && status == project.status && Objects.equals(title, project.title) && Objects.equals(description, project.description) && Objects.equals(avatar, project.avatar) && Objects.equals(createdAt, project.createdAt) && Objects.equals(updatedAt, project.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, avatar, price, provinceId, isAccepted, postId, categoryId, status, createdAt, updatedAt);
    }
}
