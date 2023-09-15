package com.example.UserManagement;

public class User
{
    private  Integer  userId;
    private  String name;
    private String address;
    private String phoneNo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public User(Integer userId, String name, String address, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }



}
