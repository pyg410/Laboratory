package com.yg.laboratory.domain;

public class User {
    String id;
    String name;
    String password;
    public User(String name, String password, String id){
        this.name=name;
        this.password=password;
        this.id=id;
    }

    public User(){

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

