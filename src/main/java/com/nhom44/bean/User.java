package com.nhom44.bean;

import java.beans.ConstructorProperties;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

public class User {
    private int id;
    private String avatar;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private Date birthday;
    private int gender;
    private int status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int provinceId;
    private String province;
    private int role;

    public User() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public User(int id, String fullName, String email, String password, String phone, Date birthday, int gender, int status, String province, int role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.gender = gender;
        this.status = status;
        this.province = province;
        this.role = role;
    }


    public String getAvatar() {
        return avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getGender() {
        return gender;
    }

    public int getStatus() {
        return status;
    }


    public int getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public void setRole(int role) {
        this.role = role;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public User(int id, String avatar, String fullName, String email, String password, String phone, Date birthday, int gender, int status, Timestamp createdAt, Timestamp updatedAt, int provinceId, int role) {
        this.id = id;
        this.avatar = avatar;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.gender = gender;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.provinceId = provinceId;
        this.role = role;
    }

    public User(int id, String avatar, String fullName, String email, String password, String phone, Date birthday, int gender, int status, Timestamp createdAt, Timestamp updatedAt, String province, int role) {
        this.id = id;
        this.avatar = avatar;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.gender = gender;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.province = province;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", avatar=" + avatar +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", province='" + province + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && avatar == user.avatar && gender == user.gender && status == user.status && role == user.role && Objects.equals(fullName, user.fullName) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(phone, user.phone) && Objects.equals(birthday, user.birthday) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updatedAt, user.updatedAt) && Objects.equals(province, user.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, fullName, email, password, phone, birthday, gender, status, createdAt, updatedAt, province, role);
    }
}