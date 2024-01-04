package com.nhom44.bean;

public class Project {
    private int id;
    private String title;
    private String description;
    private String avatar;
    private long price;
    private double acreage;
    private int status;
    private int postId;
    private int isAccepted;
    private String createdAt;
    private String updatedAt;
    private String schedule;
    private String estimated_complete;
    private String province;
    private String category;
    private int provinceId;
    private int categoryId;

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
                ", estimated_complete='" + estimated_complete + '\'' +
                ", province='" + province + '\'' +
                ", category='" + category + '\'' +
                ", provinceId=" + provinceId +
                ", categoryId=" + categoryId +
                '}';
    }

    public int getId() {
        System.out.println("getId");
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        System.out.println("getTitle");
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        System.out.println("description");
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

    public long getPrice() {
        System.out.println("price");
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getAcreage() {
        System.out.println("acreage");
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

    public String getEstimated_complete() {
        return estimated_complete;
    }

    public void setEstimated_complete(String estimated_complete) {
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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Project() {
    }

    public Project(int id, String title, String description, String avatar, long price, double acreage, int status, int postId, int isAccepted, String createdAt, String updatedAt, String schedule, String estimated_complete, String province, String category, int provinceId, int categoryId) {
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
        this.provinceId = provinceId;
        this.categoryId = categoryId;
    }
}
