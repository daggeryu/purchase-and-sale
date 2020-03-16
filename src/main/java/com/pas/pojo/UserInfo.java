package com.pas.pojo;

public class UserInfo {
    private int id;
    private String name;
    private String username;
    private String pass;
    private String phone;
    private int status;
    private String statusStr;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatusStr() {
        return statusStr;
    }
    public void setStatusStr(String statusStr) {
        if (status == 1){
            this.statusStr = "可以登录";
        }else {
            this.statusStr = "不可登录";
        }
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
