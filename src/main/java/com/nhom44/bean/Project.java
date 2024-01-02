package com.nhom44.bean;

import java.sql.Date;
import java.util.Objects;

public class Project {
    protected int id;
    protected String title;
    protected String description;
    protected String avatar;
    protected int price;
    protected double acreage;
    protected int status;
    protected int postId;
    protected int isAccepted;
    protected String createdAt;
    protected String updatedAt;
    private String schedule;
    private Date estimated_complete;
    private String province;
    private String category;

    public Project() {
    }

    public Project(int id, String title, String description, String avatar, int price, double acreage, int status, int postId, int isAccepted, String createdAt, String updatedAt, String schedule, Date estimated_complete, String province, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.avatar = avatar;
        this.price = price;
        this.acreage = acreage;
        this.status = status;
        this.postId = postId;
        this.isAccepted = isAccepted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.schedule = schedule;
        this.estimated_complete = estimated_complete;
        this.province = province;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", avatar='" + avatar + '\'' +
                ", price=" + price +
                ", acreage=" + acreage +
                ", status=" + status +
                ", postId=" + postId +
                ", isAccepted=" + isAccepted +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", schedule='" + schedule + '\'' +
                ", estimated_complete=" + estimated_complete +
                ", province='" + province + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id && price == project.price && Double.compare(acreage, project.acreage) == 0 && status == project.status && postId == project.postId && isAccepted == project.isAccepted && Objects.equals(title, project.title) && Objects.equals(description, project.description) && Objects.equals(avatar, project.avatar) && Objects.equals(createdAt, project.createdAt) && Objects.equals(updatedAt, project.updatedAt) && Objects.equals(schedule, project.schedule) && Objects.equals(estimated_complete, project.estimated_complete) && Objects.equals(province, project.province) && Objects.equals(category, project.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, avatar, price, acreage, status, postId, isAccepted, createdAt, updatedAt, schedule, estimated_complete, province, category);
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

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(int isAccepted) {
        this.isAccepted = isAccepted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Date getEstimated_complete() {
        return estimated_complete;
    }

    public void setEstimated_complete(Date estimated_complete) {
        this.estimated_complete = estimated_complete;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}