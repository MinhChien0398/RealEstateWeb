package com.nhom44.bean;

import java.io.Serializable;
import java.util.Objects;

public class Contact implements Serializable {
    private int id;
    private String fullName;
    private String email;
    private int categoryId;
    private int projectId;
    private String content;
    private String createdAt;
    private String updatedAt;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", categoryId=" + categoryId +
                ", projectId=" + projectId +
                ", content='" + content + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && categoryId == contact.categoryId && projectId == contact.projectId && Objects.equals(fullName, contact.fullName) && Objects.equals(email, contact.email) && Objects.equals(content, contact.content) && Objects.equals(createdAt, contact.createdAt) && Objects.equals(updatedAt, contact.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, categoryId, projectId, content, createdAt, updatedAt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Contact() {
    }

    public Contact(int id, String fullName, String email, int categoryId, int projectId, String content, String createdAt, String updatedAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.categoryId = categoryId;
        this.projectId = projectId;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}