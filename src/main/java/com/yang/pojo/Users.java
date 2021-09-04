package com.yang.pojo;

public class Users {
    String username;
    String password;
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "Hero{"+"username="+'\''+username.replace(" ","")+'\''+",password="+'\''+password.replace(" ","")+'\''+'}';
    }
}
