package com.svr.app.model;

public class UserModel {

    private String username;
    private String surname;
    private String email;

    
    public UserModel(String username, String surname, String email) {
        this.username = username;
        this.surname = surname;
        this.email = email;
    }
    
    public UserModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
