package com.orangehrm.models;

public class DataModelsLogin {

    private String username;
    private String password;

    public DataModelsLogin(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
